# Projet de Service Web Java (JaxWS)

## Aperçu
Ce projet Java illustre la mise en œuvre d'un service web simple en utilisant l'API Java pour les services web XML (JAX-WS). Le projet comprend les classes suivantes :

1. **Compte**
    - Représente un compte de base avec des attributs tels que le code, le solde et la date de création.

2. **JWS_App**
    - Une classe de service web annotée avec `@WebService` qui fournit des méthodes de conversion de devises et de récupération d'informations sur les comptes.
    - Comprend des méthodes telles que `convertEUR_MAD` pour la conversion de l'Euro en Dirham marocain, `getCompte` pour récupérer un compte en fonction de son code, et `listComptes` pour obtenir une liste de comptes d'exemple.

3. **WebServer**
    - La classe principale qui publie `JWS_App` en tant que service web à une adresse spécifiée.

## Captures d'écran
![Demarrage du serveur](./screenshots/Demarrageduserveur.png)
![WSDL](./screenshots/WSDL.png)
![Convertion du EUR vers MAD](./screenshots/convertEUR_MAD.png)
![Methode getCompte](./screenshots/getCompte.png)
![Methode listComptes](./screenshots/listComptes.png)


## Structure du Projet
Le projet est organisé avec les packages suivants :

- **ws :** Contient les classes principales du projet.

## 🚀 Comment Exécuter
1. Clonez le dépôt sur votre machine locale.
   ```bash
   git clone https://github.com/Dev7HD/WebServiceSOAP
   ```

2. Ouvrez le projet dans votre IDE Java préféré (pour moi c'est IntelliJ).

3. Exécutez la classe `WebServer` pour démarrer le serveur JAX-WS.

4. Le serveur sera accessible à l'adresse `http://0.0.0.0:8989/`.

## Points d'Accès du Service Web

### 1. Convertir l'Euro en Dirham Marocain
- **Endpoint :** `/convertEUR_MAD`
- **Méthode :** POST
- **Paramètres :**
  - `montant` (double) : Le montant en Euro à convertir.

### 2. Obtenir des Informations sur le Compte
- **Endpoint :** `/getCompte`
- **Méthode :** POST
- **Paramètres :**
  - `code` (int) : Le code du compte.

### 3. Liste des Comptes
- **Endpoint :** `/listComptes`
- **Méthode :** GET

## Exemple d'Utilisation

### Convertir l'Euro en Dirham Marocain
```java
double montantEnEuro = 50.0;
double montantConverti = jwsAppService.convertEUR_MAD(montantEnEuro);
System.out.println("Montant Converti : " + montantConverti);
```

### Obtenir des Informations sur le Compte
```java
int codeCompte = 1;
Compte compte = jwsAppService.getCompte(codeCompte);
System.out.println("Informations sur le Compte : " + compte);
```

### Liste des Comptes
```java
List<Compte> comptes = jwsAppService.listComptes();
for (Compte compte : comptes) {
    System.out.println("Informations sur le Compte : " + compte);
}
```

N'hésitez pas à explorer et étendre le projet selon vos besoins spécifiques. 🛠️
