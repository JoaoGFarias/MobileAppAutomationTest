# MobileAppAutomationTest

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/92ace59634244e31b41d89a470e3d2e3)](https://app.codacy.com/app/jgfarias42/MobileAppAutomationTest?utm_source=github.com&utm_medium=referral&utm_content=JoaoGFarias/MobileAppAutomationTest&utm_campaign=Badge_Grade_Settings)
[![CircleCI](https://circleci.com/gh/JoaoGFarias/MobileAppAutomationTest/tree/master.svg?style=svg)](https://circleci.com/gh/JoaoGFarias/MobileAppAutomationTest/tree/master)

Dear candidate,

🎈 Welcome to the mobile test challenge.

As a talented QA engineer, your task is to write pretty and stable Android UI tests with [**Espresso**](https://developer.android.com/training/testing/espresso/index.html) for the given Android source code / app.

✏️ **Task**:
* Login case, the up-to-date credential (`username` & `password`) you can find [here](https://randomuser.me/api/?seed=a1f30d446f820665)).
* Search for "***sa***", select the 2nd result (via the name, not the index) from the list, then click the call button.
* Deploy the tests on [**CircleCI**](https://circleci.com/), and send us the link to the CircleCI builds overview page.

📖 **Rules**:
* The only rule is to use Espresso ☕ ;)
* Don't worry if you have no Espresso experience, we believe that you're a fast learner, and we'd like to give you enough time to finish this challenge.
* You can choose either Java or Kotlin, whatever you prefer.
* Try your best to apply best practice when writing test code.
* Feel free to touch the product's source code, apply any necessary change (for testability, fixing bug or improving code).
* Think big, what possible scenarios should be tested if the app has various kinds of users?  You don't have to code this, just show your thoughts in plain text.
* QA engineers don't only work with developers, but also closely collaborate with product managers.  It would be great if you have a strong product sense, you're welcome to spot any UX issues in this demo app and write it down.

💪 Roll up your sleeves and have fun 😊

# Results

- [Circle CI configuration](https://github.com/JoaoGFarias/MobileAppAutomationTest/blob/master/.circleci/config.yml)
- [Espresso tests](https://github.com/JoaoGFarias/MobileAppAutomationTest/tree/master/AndroidDemo/app/src/androidTest/java/com/mytaxi/android_demo)
    - Search for "sa", selecting second driver and calling
    - Logout
    - Inspecting Login screen input text and behavior
    - Enabling accessibility checks as warnings
- [Exploraty testing charters, focused on Usability evaluation](https://github.com/JoaoGFarias/MobileAppAutomationTest/tree/master/exploratory_charts)
- [Code quality flags][https://github.com/JoaoGFarias/MobileAppAutomationTest/blob/master/README.md#mobileappautomationtest]
- [Automated static analysis with Codacy](https://app.codacy.com/project/jgfarias42/MobileAppAutomationTest/dashboard)
