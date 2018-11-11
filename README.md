# Text Transformer
Dla osób pracujących z danymi tekstowymi nasza aplikacja Text Transformer umożliwi transformacje danych tekstowych (np. zmiana wielkości liter, eliminacja duplikatów, itd.). Aplikacja będzie dostępna poprzez GUI a także zdalne API dzięki czemu będzie można ją zintegrować z istniejącymi narzędziami.
## Wymagania:
- Wtyczka RESTClient w przeglądarce
- Java IDE
- Java Development Kit 1.8
## Instrukcja uruchomienia:
1. Uruchomienie programu w Java IDE,
2. Uruchomienie RESTClient w przeglądarce,
3. Ustawienie metody *POST*,
4. Dodanie *Header* w RESTClient:
    - Name: `Content-Type`;
    - Attribute Value: `application/json`.
5. Wpisanie adresu w polu *URL*:
```
http://localhost:8081/<transformowany tekst>
```
6. Wklejenie do *body* poniższego tekstu:
```
{
"basicTransform":"",
"shortcut":"",
"inverse":,
"numbers":,
"latex":,
"neighbors":
}
```
Dostępne wartości:
  Dla inverse, numbers, latex, neighbors: `true, false`;
  Dla basicTransform: `upper, lower, capitalize`;
  Dla shortcut: `expand, compress`,
7. Wysłanie zapytania przyciskiem *SEND*,
8. W zakładce *Response* pojawi się wynik zapytania.
## Autorzy:
- Bartosz Żywicki
- Tomasz Pucka
- Marcin Rochowiak
## Inne:
[Trello](https://trello.com/b/WtxDTkbB/text-transformer)
    
[Definition of done](https://docs.google.com/spreadsheets/d/e/2PACX-1vSxEKEBzcopOqfu9OHFwQkD2oDQlztfqAW0Tf_IXjElZQyKDUrzl4-oxI78NQEHZaLh1Vorl2RSyEf3/pubhtml)

![Build status](https://travis-ci.org/bambucia100/io-text-transformer.svg?branch=master)

