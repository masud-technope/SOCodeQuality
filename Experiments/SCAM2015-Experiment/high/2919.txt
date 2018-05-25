String parentHandle = driver.getWindowHandle(); // get the current window handle
driver.findElement(By.xpath("//*[@id='someXpath']")).click(); // click some link that opens a new window

for (String winHandle : driver.getWindowHandles()) {
    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
}

//code to do something on new window

driver.close(); // close newly opened window when done with it
driver.switchTo().window(parentHandle); // switch back to the original window