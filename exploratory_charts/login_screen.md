# Charter

    - myTaxi's Login Screen evaluation, focused on usability.

## Areas

    - Login screen

## Duration

    - 10 minutes

## Test notes

    - The login functionality seems to work flawlessly, but the UI could be improved and questioned, specially regarding accessibility and the feedback to bad commands from the user.

## Opportunity

    - None

## Bugs

    - "Wrong credentials do not trigger an alert message"
        - Steps to reproduce
            - Input wrong credentials
            - Try to Login
        - Expected results
            - A small alert saying "Wrong username/password, try again." should be displayed
        - Actual results
            - Nothing happens

## Issues

    - No option to see the typed password, as it is commonly provided in login screens;
    - No option to recover a password;
    - Rapid selecting _Username_ and _Password_ inputs, back and forth, causes small delays, which may indicate bad resource management.