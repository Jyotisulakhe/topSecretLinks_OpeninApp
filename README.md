
# OpenInApp Web Application Automation

This project automates key functionalities on the OpenInApp web application using Selenium WebDriver with Java. The automation script simulates user interactions on a mobile browser (Chrome or Safari) and covers creating resource links using the TopSecret Link feature and sharing these links on Instagram.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Step-by-Step Process](#step-by-step-process)
- [Test Scenarios](#test-scenarios)
- [Reporting](#reporting)


## Overview

This project automates the following tasks on the OpenInApp web application:

1. **Open Chrome Browser**: Initiate the Chrome browser using Selenium WebDriver.
2. **Access OpenInApp Dashboard**: Navigate to the OpenInApp web application via the browser.
3. **Login to the Application**: Automate the login process by entering the necessary credentials.
4. **Navigate to Top Secret Links Page**: Access the Top Secret Links feature on the dashboard.
5. **Create Secret Links**: Automate the creation of four distinct resource links by entering details, including the link, description, and pricing data.
6. **Share Links on Instagram**: Automate the process of copying the generated links and pasting them into the Instagram bio.
7. **Share with Fans**: Validate that the links are shared on Instagram and accessible to followers, allowing them to view and interact with the content.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- **Java Development Kit (JDK)**: Ensure you have JDK 8 or above installed.
- **Maven**: Dependency management tool.
- **Selenium WebDriver**: Included via Maven dependencies.
- **ChromeDriver/SafariDriver**: Download the appropriate WebDriver for your mobile simulation.
- **Instagram Account**: Ensure you have access to an Instagram account to share the links.


## Step-by-Step Process

### 1. Open Chrome Browser
The automation script begins by launching the Chrome browser using Selenium WebDriver.

### 2. Access OpenInApp Dashboard
Navigate to the OpenInApp web application and load the dashboard.

### 3. Login to the Application
Automate the login process by entering the required credentials (username and password).

### 4. Navigate to Top Secret Links Page
Once logged in, the script navigates to the Top Secret Links section of the dashboard.

### 5. Create Secret Links
Create four distinct resource links by filling in details such as the link URL, description, and pricing information. Each link is designed to be shared with fans.

### 6. Share Links on Instagram
The script copies each generated link and pastes it into the Instagram bio section, ensuring the links are available for followers to access.

### 7. Share with Fans
Verify that the links are successfully shared on Instagram and can be accessed by followers.

## Test Scenarios

1. **Login to OpenInApp Web Application**: Validate login functionality using mobile browsers.
2. **Create TopSecret Links**: Automate the creation of four distinct resource links with appropriate details.
3. **Share Links on Instagram**: Automate the process of sharing the generated links in the Instagram bio and verify their accessibility.

## Reporting

The results of the tests, including passed and failed cases, are reported using TestNG's reporting tools.

## OpeninApp page

![Screenshot 2024-08-23 110035](https://github.com/user-attachments/assets/a274a89e-3206-4eae-b5e2-30fdbbd74b9e)

## Instagram page

![Screenshot 2024-08-23 110035](https://github.com/user-attachments/assets/a274a89e-3206-4eae-b5e2-30fdbbd74b9e)


