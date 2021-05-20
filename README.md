# Java-labs
### Content:
* Abstract class
* Enums  
* Lombok
* Streams, Lambdas

### Як запустити:
* За допомогою команди ___git clone \<url to this project\>___ завантажуємо проєкт;
* Відкриваємо командний рядок;
* Командою ___cd \<path to downloaded project\>___ заходимо в корінь програми;
* Вводимо команди:
    1. ___mvn compile___;
    2. ___mvn exec:java -Dexec.mainClass=ua.lviv.iot.App___;
* Отримуємо результат нашої програми.

### Useful commands:
* ___mvn checkstyle:check___ - shows all style mistakes.
* ___mvn findbugs:gui___ - this will launch the FindBugs GUI configured for this project and will open the 
  findbugsXml.xml file if present.
* ___mvn pmd:pmd___ - works only with Java 8 or earlier, analyzes code.