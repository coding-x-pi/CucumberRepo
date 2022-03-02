Feature: Testing scenarios retlated to art home page

 Scenario: Getting the scores BOards of the india Cricket T20 matches
     
      Given the user is in the home page of the cricketexchange
      Then it must look for the indias matches and if found go to the respective match pages
      And display the Batsman scoreDetails of the default selected team
      And display the Bowling scoreDetails of the default selected team
      And display the Fall of wickets scoreDetails of the default selected team
      And display the Batsman scoreDetails of the another team
      Then display the Bowling scoreDetails of the another team
      And display the Fall of wickets scoreDetails of the another team
   
      
