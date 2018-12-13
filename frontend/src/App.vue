<template>
  <div id="app">
    <h1>Text Transformer</h1>
    <div class="text-areas">
      <p>Please type the text you wish to transform:</p>
      <textarea class="properties" v-model="originalText" placeholder="Text to transform..." rows="3" cols="50" style="background-color: #EEE"></textarea>
    </div>
    <div class="text-areas">
      <p>Transformed text:</p>
      <textarea disabled class="properties" placeholder="Transformed text..." rows="3" cols="50" style="background-color: #; color: #000">{{transformedText}}</textarea>
    </div>
    <p>Please select the properties of transformation:</p>
    <div class="properties">
      <span>Basic transform</span><br>
      <select name="basicTransform" v-model="body.basicTransform">
        <option value="none" selected>None</option>
        <option value="upper">Upper</option>
        <option value="lower">Lower</option>
        <option value="capitalize">Capitalize</option>
      </select><br>
      <span>Shortcuts modifier</span><br>
      <select name="ShortcutsModifier" v-model="body.shortcuts">
        <option value="none" selected>None</option>
        <option value="expand">Expand</option>
        <option value="compress">Compress</option>
      </select><br>
      <input type="checkbox" v-model="body.inverse">Inverse text<br>
      <input type="checkbox" v-model="body.numbers">Numbers expand<br>
      <input type="checkbox" v-model="body.latex">Latex approvable<br>
      <input type="checkbox" v-model="body.neighbors">Neighbors remover<br>
      <input type="checkbox" v-model="body.comma">Comma adder<br>
      <input type="checkbox" v-model="body.leetspeak">Make leetspeak<br>
      <input type="checkbox" v-model="body.polishLetter">Remove polish letters<br>
    </div>
    <button @click="transform()">Submit</button>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'transformer',
  data () {
    return {
      errors: [],
      originalText: '',
      transformedText: '',
      body: {
        basicTransform: 'none',
        shortcuts: 'none',
        inverse: false,
        numbers: false,
        latex: false,
        neighbors: false,
        comma: false,
        leetspeak: false,
        polishLetter: false
      }
    }
  },
  methods: {
    transform () {
      axios.post(this.originalText, {
        basicTransform: this.body.basicTransform,
        inverse: this.body.inverse,
        numbers: this.body.numbers,
        shortcuts: this.body.shortcuts,
        latex: this.body.latex,
        neighbors: this.body.neighbors,
        comma: this.body.comma,
        leetspeak: this.body.leetspeak,
        polishLetter: this.body.polishLetter
      },
      {
        headers:
            { 'Content-Type': 'application/json' }
      })
        .then(response => {
          // JSON responses are automatically parsed.
          this.transformedText = response.data
          console.log(response.data)
          console.log(response.status)
          console.log(response.statusText)
          console.log(response.headers)
          console.log(response.config)
        })
        .catch(e => {
          this.errors.push(e)
        })
    }
  }
}
</script>

<style>
  span, p {
    margin: 4px;
  }
  html {
    border-left: 5px solid #555;
    height: 100%;
    margin-left: 10%;
  }
  body {
    font-family: Helvetica;
    background-color: #222;
    color: #EEE;
  }
  select {
    margin: 3px 0 3px 10px;
  }
  input {
    margin-right: 6px;
  }
  button {
    font-size: 1.1em;
  }
  .properties {
    margin: 8px;
  }
  .text-areas {
    display: inline-block;
  }
  textarea {
    font-size: 1.2em;
  }
</style>
