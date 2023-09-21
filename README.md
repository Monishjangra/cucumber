# Cucumber
- Create a maven project in eclipse
- Create a package (features) and feature file in src/test/resources
- Create a package (stepDefinition) and stepDef.java, TestRunner.java files in src/test/java 

- Dependency required:
  - cucumber-java
  - cucumber-junit
  - selenium-java
  - junit

- For opening browser and our site to test
  - driver = new ChromeDriver();
    driver.manage().window().maximize(); //for max. the browser window 
    driver.get("http://localhost:8080/home");
- For check tittle of page and verify
  - String tittle = driver.getTitle();
    Assert.assertEquals("Home", tittle);
- For clicking the button
  - WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", button);
- To give input
  - driver.findElement(By.name("username")).sendKeys("monish@gmail.com");
    driver.findElement(By.name("password")).sendKeys("user");
- If we need to pass data from feature file to stepDefinition file
  - Then Enter valid "monish@gmail.com" and "user". (feature file)
  - @Then("Enter valid {string} and {string}.")
    public void Enter_valid_username_and_password(String username, String password) throws InterruptedException {
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
- 