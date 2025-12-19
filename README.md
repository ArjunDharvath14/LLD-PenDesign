# LLD – Pen Design

## Overview
This project demonstrates a **Low Level Design (LLD)** of a Pen system using **Object-Oriented Design principles** in Java.

The goal of this design is to model different types of pens, their refills, ink, and writing behavior in a clean, extensible way.

---

## Requirements

1. A **pen** is anything that can write.
2. The system supports different types of pens:
   - Ball Pen
   - Gel Pen
   - Fountain Pen
   - Marker
3. **Ball pens** use a *ball pen refill*.
4. **Gel pens** use a *gel pen refill*.
5. A **refill** consists of:
   - A **tip**
   - **ink**
6. Each refill has a **radius**.
7. **Ink** can be of different colors (blue, black, red, etc.).
8. A **fountain pen** directly contains ink (no refill).
9. The **tip of a fountain pen** also has a radius.
10. All pens **write in the same way**.
11. Every pen has a **brand** and a **name**.
12. Some pens allow **refilling**, while others do not.

---

## Design Approach

- Used **abstraction** to define common behavior of all pens.
- Used **inheritance** to represent different pen types.
- Used **composition** for:
  - Refill → Ink + Tip
  - Pen → Refill (where applicable)
- Writing behavior is common for all pens.
- The design follows **SOLID principles**, especially:
  - Single Responsibility Principle
  - Open/Closed Principle

---

## Key Components

### Pen
- Base abstraction for all pens.
- Contains common properties like:
  - Brand
  - Name
- Defines common writing behavior.

### Pen Types
- **BallPen**
- **GelPen**
- **FountainPen**
- **Marker**

### Refill
- Contains:
  - Ink
  - Tip
- Has a radius.
- Used by ball pens and gel pens.

### Ink
- Represents ink color.

### Tip
- Represents the writing tip.
- Has a radius.

---

## Refill Support
- Ball pens and gel pens support refilling.
- Fountain pens contain ink directly.
- Some pens may not support refilling.

---

## Extensibility
- New pen types can be added easily.
- New ink colors or refill types can be added without modifying existing code.

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/ArjunDharvath14/LLD-PenDesign.git
