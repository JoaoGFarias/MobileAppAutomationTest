# Charter
    - myTaxi's Main Screen evaluation, focused on usability.

## Areas

    - Main screen

## Duration

    - 10 minutes

## Test notes

    - The main functionality seems to work flawlessly, but the UI could be improved to provide better feedback and flow for the user.

## Opportunity

    - None

## Bugs
    - "No indication for search empty results, causing confusion on the user if it's request have finished"
        - Steps to reproduce
            - Search for a driver that's does not exists
        - Expected results
            - A list with one item saying "No driver found" should be displayed
        - Actual results
            - Nothing happens
    - "Click on the keyboard back button closes the driver list"
        - Steps to reproduce
            - Input a valid driver name in the search field
            - Click on the keyboard back button
        - Expected results
            - The keyboard should be dissmissed
            - The list should remain, allowing the user to inspect it completly
        - Actual results
            - The list is dismissed, blockig the user from inspecting it completly

## Issues

    - No option to clean the search (_x button on the right side_).

## Unexplored risks

    - UI for long lists;
    - UI for search timeout.