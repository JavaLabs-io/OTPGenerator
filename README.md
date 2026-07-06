<div align="center">

# OTP Generator

A Java application that generates a secure **6-digit One-Time Password (OTP)** using Java's built-in `SecureRandom` class.

<img src="https://img.shields.io/badge/Java-2C3930?style=for-the-badge&logo=openjdk&logoColor=white">
<img src="https://img.shields.io/badge/SecureRandom-27391C?style=for-the-badge">
<img src="https://img.shields.io/badge/Console_Application-3F4F44?style=for-the-badge">
<img src="https://img.shields.io/badge/JavaLabs-io-36454F?style=for-the-badge">

</div>

---

## Features

- Generates a random 6-digit OTP
- Uses `SecureRandom` for cryptographically secure randomness
- Guarantees exactly six digits
- Lightweight console application
- Beginner-friendly Java project

---

## How It Works

The program creates a random number between **100000** and **999999**, ensuring every generated OTP contains exactly six digits.

```java
int otp = 100000 + new SecureRandom().nextInt(900000);
```

---

## Example Output

<p align="center">
  <img src="assets/OtpGen.png" alt="OTP Generator Output" width="650">
</p>

---

## Run the Project

Compile:

```bash
javac OtpGen.java
```

Run:

```bash
java OtpGen
```

---
