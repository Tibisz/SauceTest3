# Proiect Automatizare Teste - SauceDemo

## Descriere generală

Acest proiect automatizează scenariul de login, adăugarea unui produs în coș și finalizarea checkout-ului pe site-ul [SauceDemo](https://www.saucedemo.com/). Testele sunt scrise în Java folosind Selenium WebDriver, Cucumber și JUnit5. Pentru logging se folosește SLF4J cu Logback.

---

## Structura proiectului

### 1. `pages` - Page Objects

Conține clasele care reprezintă paginile aplicației.

- **LogIn.java**: gestionează logarea utilizatorului.

  - `open()`: deschide pagina principală.
  - `login(username, password)`: completează câmpurile de login și dă click pe butonul de login.

- **HomePage.java**: interacțiunea cu pagina de produse.

  - `addBackpackToCart()`: adaugă produsul backpack în coș.
  - `openCart()`: deschide pagina coșului.

- **Cart.java**: interacțiuni cu pagina de coș.

  - `clickCheckout()`: continuă spre pagina de checkout.

- **CheckOut.java**: completarea și finalizarea checkout-ului.

  - `fillInformation(firstName, lastName, postalCode)`: completează datele utilizatorului.
  - `continueButton()`: apasă butonul Continue.
  - `finishButton()`: finalizează comanda.

### 2. `Utils` - Helper

- **ElementHelper.java**: clase utility pentru așteptări și interacțiuni cu elemente.
  - `waitVisible(locator)`: așteaptă ca elementul să fie vizibil.
  - `waitClickable(locator)`: așteaptă ca elementul să fie clickabil.
  - `click(locator)`: click pe element.
  - `insertText(locator, text)`: inserează text în câmp.
  - `isPresent(locator)`: verifică dacă elementul există.

### 3. `base` - Clase de bază

- **BaseTest.java**: inițializare și închidere WebDriver.
  - `launchBrowser()`: setează ChromeOptions și deschide browserul.
  - `closeBrowser()`: închide browserul.

### 4. `steps` - Cucumber Steps & Hooks

- **CheckOutSteps.java**: pașii Cucumber pentru scenariul de checkout.

  - În fiecare pas se folosesc obiectele Page Object și helper-ul.
  - Se adaugă loguri cu SLF4J în loc de `System.out.println`.

- **Hooks.java**: metode pentru setup și teardown pentru fiecare scenariu.

  - `@Before`: inițializează browserul.
  - `@After`: închide browserul și loghează rezultatul scenariului.

### 5. `runners` - Cucumber Runner

- **RunCucumberTest.java**: configurează JUnit5 și Cucumber pentru rularea scenariilor.
  - Specifică resursa `.feature` și locația pachetelor cu pași.
  - Generează rapoarte `html` și `junit`.

### 6. `tests` - Teste unitare

- **SauceDemo.java**: test clasic folosind JUnit5 pentru flow-ul complet de checkout.

### 7. `features` - Cucumber Feature Files

- **checkout.feature**: definește scenariul pentru adăugarea unui produs și finalizarea comenzii.

```
Feature: Add product to cart and checkout on Sauce Demo
  As a shopper
  I want to log in, add a product to the cart, and complete checkout
  So that I can finish a purchase successfully

  Scenario: Successful checkout of the first inventory product
    Given I open the Sauce Demo site
    And I log in with valid credentials
    When I add the first product to the cart
    And I proceed to checkout with my details
```



## Considerații și bune practici

- Folosirea Page Object Pattern pentru a izola logica interacțiunii cu paginile.
- Folosirea SLF4J pentru logging centralizat și configurabil.
- Așteptări explicite prin `WebDriverWait` pentru stabilitate.
- Rulare paralelă și teardown sigur prin `@Before` și `@After` în Hooks.
- Posibile erori de tip NullPointerException dacă driver-ul nu este corect inițializat; folosește dependency injection și driver din BaseTest.

---

## Concluzie

Acest proiect oferă o bază solidă pentru automatizarea flow-ului de checkout pe SauceDemo, cu Cucumber pentru BDD, Page Object Pattern pentru modularitate și SLF4J pentru logging avansat.


