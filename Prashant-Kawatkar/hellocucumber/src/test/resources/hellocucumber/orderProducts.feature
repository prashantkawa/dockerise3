@Order_Product
Feature:
  In order to book the product verify that Magento page is loading and able to book the products
  
  @MagentoAssignment
  Scenario: I Validate product booking
    Given I am on the Home Page "https://magento.softwaretestingboard.com/"
    Then I click on Men tab
    Then I click on Tops tab
    Then I click on Jackets tab
    Then I select Size And I select Color
    Then I click on Add to cart button
    Then I click on Shopping cart link
    Then I click on Proceed to checkout button
    
    Then I enter email <Email> And firstName <firstName> And lastName <lastName>
		Then I enter streetAddress <streetAddress> And city <City> And country <Country> And state <State> And pinCode <pinCode>
		Then I enter telephone <Telephone> number
		Then I click on Next button
		
		Then I check Address checkbox And I click on Place order
		Then I verify order successfully placed
		
		
		Examples:  
    |Email    			|firstName   |lastName 	|streetAddress|City	 |Country|State				 |pinCode |Telephone	 |
    |"abc@gmail.com"|"Steve"	   |"Rogers"	|"Viman Nagar"|"Pune"|"India"|"Maharashtra"|"411014"|"1234567890"|