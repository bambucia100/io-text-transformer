# Text Transformer
Dla osób pracujących z danymi tekstowymi nasza aplikacja Text Transformer umożliwi transformacje danych tekstowych (np. zmiana wielkości liter, eliminacja duplikatów, itd.).
## Wymagania:
- Java IDE
- Java Development Kit 1.8
- Maven
- Node.js
- NPM
- NPM, Maven oraz JDK w PATH
## Instrukcja uruchomienia:
1. Wymagania wstępne:

#### Linux
```
sudo apt update
sudo apt install node
npm install -g @vue/cli
```
#### Windows
```
npm install -g @vue/cli
```
2. Uruchomienie w folderze głównym kolejno:
```
mvn clean build
mvn --projects backend spring-boot:run
cd frontend
npm run serve
```
3. Przejdź do adresu http://localhost:8080/ w przeglądarce.
## Autorzy:
- Bartosz Żywicki (Spring Boot + logic)
- Tomasz Pucka (frontend)
- Marcin Rochowiak (logic)
## Inne:
[Trello](https://trello.com/b/WtxDTkbB/text-transformer)
    
[Definition of done](https://docs.google.com/spreadsheets/d/e/2PACX-1vSxEKEBzcopOqfu9OHFwQkD2oDQlztfqAW0Tf_IXjElZQyKDUrzl4-oxI78NQEHZaLh1Vorl2RSyEf3/pubhtml)

![Build status](https://travis-ci.org/bambucia100/io-text-transformer.svg?branch=master)

