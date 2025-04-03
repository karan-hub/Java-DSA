# Arrays in Java

## 📌 Java Arrays

Java arrays are a collection of similar data type values. They are used to store multiple values in a single variable, instead of declaring separate variables for each value.

---

### 🖋️ Syntax

```java
datatype[] variable_name = new datatype[size];
```

<p align="center"><strong>OR</strong></p>

```java
datatype[] variable_name;
variable_name = new datatype[size];
```

<p align="center"><strong>OR</strong></p>

```java
datatype[] variable_name = {value1, value2, value3, valueN};
```

---

### 📖 Understanding the Syntax

#### 🔹 `datatype[] variable_name;`

This step initializes the variable, which gets allocated in the **stack** during compile time.

**Example:**

```java
int[] number;
```

**Stack:**

```
number
```

*Reference variable initialized!*

---

#### 🔹 `variable_name = new datatype[size];`

In this step, a new object is created in the **heap memory** during runtime using the `new` keyword.

**Example:**

```java
number = new int[6];
```

**Stack:**

```
number
```

**Heap:**

```
{n[0], n[1], n[2], n[3], n[4], n[5]}
```

*If these reference variables have nothing to point to, they will return `null` when accessed.*

---