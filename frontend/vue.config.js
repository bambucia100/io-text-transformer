// vue.config.js
module.exports = {
  devServer: {
    proxy: 'http://localhost:8088'
  },
  outputDir: 'target/dist',
  assetsDir: 'static'
}
