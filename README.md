# FlagMaker

## Overview
**FlagMaker** is a Java-based graphical rendering utility designed to dynamically construct pixel-accurate representations of national flags at arbitrary scales.  
The application utilizes a discrete coordinate grid system (via the `MyGrid` class) to map colors onto a 2D canvas, ensuring correct proportions and patterning for each supported flag.

This project demonstrates:
- **Procedural rendering** without image assets
- **Coordinate-based coloring algorithms**
- **Static method design patterns**
- **Encapsulation of drawing logic per flag type**
- **Basic user interaction via a console interface**

---

## Features
- Supports **9 predefined national flags**:
  1. Indonesia  
  2. Lithuania  
  3. Rwanda  
  4. Malta  
  5. Afghanistan  
  6. Eritrea  
  7. Macedonia  
  8. The Bahamas  
  9. Zimbabwe
- **Dynamic resolution scaling**: height is user-defined (minimum 4, maximum 30), width automatically set to `2 × height`.
- **Proportional validation**: enforces divisibility constraints per flag specification.
- **Error handling**: invalid dimensions or unsupported codes trigger a distinct *error flag*.
- **Pixel-level control** via `setColor(int row, int col, Color color)` from `MyGrid`.

---

## Architecture
src/
├── FlagMaker.java # Core rendering logic for all supported flags
├── ExampleDriver.java # CLI interface, input handling, and grid initialization
└── GridTools/
└── MyGrid.java # Abstraction for a pixel grid using Java AWT & Swing

markdown
Copy
Edit

### Key Classes
- **FlagMaker** – Implements `drawFlag(MyGrid grid, int countryCode)`. Uses conditional dispatch to select the correct pattern and apply coloring algorithms at the cell level.
- **ExampleDriver** – Accepts user input, validates constraints, instantiates `MyGrid`, and delegates rendering to `FlagMaker`.
- **MyGrid** – Provides a 2D coordinate system backed by a Swing `JFrame`, with methods to query grid dimensions (`getHt`, `getWd`) and set pixel colors.

---

## Rendering Process
1. **Input Acquisition** – User specifies `countryCode` and desired height (CLI).
2. **Grid Instantiation** – `ExampleDriver` creates a `MyGrid` object with height `H` and width `2 × H`.
3. **Flag Selection & Validation** –  
   `FlagMaker.drawFlag()`:
   - Verifies proportional constraints for the selected flag.
   - Executes flag-specific rendering logic.
4. **Color Application** – Fills grid cells using:
   ```java
   grid.setColor(row, col, Color.RED);
Error State Handling – Invalid input dimensions or unrecognized codes trigger the error flag.

Example Usage
bash
Copy
Edit
javac FlagMaker.java ExampleDriver.java GridTools/MyGrid.java
java ExampleDriver
Sample run:

python-repl
Copy
Edit
Type the number of the flag you want to see:
1 Indonesia
2 Lithuania
...
9 Zimbabwe
Your choice here: 3
Choose a size (4 or larger): 12
A Swing window opens displaying the scaled flag.

Design Notes
No image assets – All graphics are computed and drawn procedurally.

No arrays or collections – Flag construction logic is implemented using loops and control flow only.

Resolution-independent – Any valid height produces a correctly scaled flag while preserving proportions.

Static methods only – Rendering functions are public static with private helper methods for modularity.

Constraints
Minimum height: 4

Maximum height: 30

Width: always double the height

Certain flags require divisibility by 2, 3, 4, or 7 for accurate scaling.

Colors limited to AWT’s built-in palette: BLACK, BLUE, GREEN, ORANGE, RED, WHITE, YELLOW.
