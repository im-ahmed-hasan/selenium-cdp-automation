# CDP Console Log Capture with Selenium 4.34.0

A minimal Java example demonstrating how to capture browser console logs using Chrome DevTools Protocol (CDP) with Selenium 4.34.0 and ChromeDriver.

---

## 🔍 Overview

This project uses **Chrome DevTools Protocol (CDP)** to tap into the browser’s internal console and listen for JavaScript log events like `console.log`, `console.error`, and more — all through **Selenium 4.34.0**.

Created by **Ahmed Hasan**, 2025.

---

## 📦 Tech Stack

- Java 22+
- Selenium 4.34.0
- ChromeDriver (auto-resolved by Selenium Manager)
- Chrome 138 or later

---

## 🚀 How It Works

- Starts a ChromeDriver session
- Attaches a CDP `DevTools` session
- Enables log capture via `Log.enable()`
- Listens for and prints browser console log entries

---

## 🛠️ Setup Instructions

### 1. Clone the Repo

```bash
git clone https://github.com/im-ahmed-hasan/selenium-cdp-automation.git
cd cdp-console-log-capture


