**BodyClient est un logiciel de gestion de clientele Fitness réalisé dans un but d'apprentissage avec DIGINAMIC**

- Tech utilisée :
  - JAVA 21
  - SPRING Framework
  - Mongo DB
 
**- Comment faire fonctionner le projet ? ⚙️**

1. Cloner le projet : `git clone https://github.com/Ozneeee/bodyclient.git`
2. CD : `cd bodyclient`
3. Installer les deps : `./mvnw clean install`
4. Lancer mongoDB en localhost et ouvrir compass sur localhost:2701 (port par défault)
5. Run le back-end : `./mvnw spring-boot:run`
6. Run le front-end : 
    - Vs Code : `Allez dans bodyclient\src\main\resources\static\index.html est lancer le live server`
    - STS (avec python) : `python -m http.server 5500`
7. ENJOY 😄


**Méthodes fonctionnelles :**
- post
- put
- delete
- get
