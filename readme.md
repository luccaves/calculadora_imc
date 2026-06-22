# 🧮 Calculadora de IMC

Aplicação desktop desenvolvida em **Java** que calcula o Índice de Massa Corporal (IMC) do usuário e exibe o resultado com uma classificação detalhada por meio de janelas gráficas (`JOptionPane`).

---

## 📋 Funcionalidades

- Coleta peso e altura do usuário via janelas de diálogo
- Calcula o IMC automaticamente com a fórmula: `IMC = peso / altura²`
- Exibe o resultado com duas casas decimais
- Classifica o IMC em 6 categorias:

| IMC | Classificação |
|-----|---------------|
| Abaixo de 18.5 | Abaixo do peso |
| 18.6 – 24.9 | Peso ideal |
| 25.0 – 29.9 | Levemente acima do peso |
| 30.0 – 34.9 | Obesidade grau I |
| 35.0 – 39.9 | Obesidade grau II (severa) |
| 40.0 ou mais | Obesidade grau III (mórbida) |

---

## 🚀 Como executar

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) 8 ou superior instalado

### Passos

```bash
# Clone o repositório
git clone https://github.com/luccaves/calculadora_imc.git

# Acesse a pasta do projeto
cd calculadora_imc/src

# Compile o arquivo
javac Main.java

# Execute o programa
java Main
```

---

## 🖥️ Como usar

1. Ao executar, uma janela pedirá o seu **peso** (em kg)
2. Em seguida, outra janela pedirá sua **altura** (em metros, ex: `1.75`)
3. O resultado será exibido em uma nova janela com seu IMC e a classificação correspondente

---

## 🗂️ Estrutura do projeto

```
calculadora_imc/
└── src/
    └── Main.java
```

---

## 🛠️ Tecnologias utilizadas

- Java
- `javax.swing.JOptionPane` — interface gráfica de diálogo
- `Math.pow()` — cálculo de potência para a fórmula do IMC

---

## 👤 Autor

Feito por [luccaves](https://github.com/luccaves)
