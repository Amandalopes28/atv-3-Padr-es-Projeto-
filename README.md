# atv-3-Padr-es-Projeto-


# Sistema Refatorado de Sensores utilizando padrões de projeto

Este projeto é uma refatoração de um sistema legado que gerencia sensores embarcados em uma linha de produção inteligente. O sistema foi reestruturado utilizando padrões de projeto GoF com o objetivo de tornar reutilizável e fácil de manter.

## Autor
-Nome do aluno: Amanda Santos Lopes 
-Disciplina: Padrões de Projeto
-Professor: Felipe Silva

##  Estrutura do Projeto

```
SistemaSensoresRefatorado/
├── Main.java
├── SensorManager.java
├── interfaces/
│   └── Sensor.java
├── sensores/
│   ├── SensorTemperatura.java
│   ├── SensorUmidade.java
│   ├── SensorLuminosidade.java
│   ├── adapters/
│   │   ├── SensorTemperaturaAdapter.java
│   │   ├── SensorUmidadeAdapter.java
│   │   └── SensorLuminosidadeAdapter.java
│   └── decorators/
│       ├── SensorComLog.java
│       ├── SensorComAlerta.java
│       └── SensorDecorator.java
├── factory/
│   └── SensorFactory.java
├── display/
│   └── DisplayConsole.java
└── README.md
```



## Padrões de Projeto que foram usados 

### Adapter
- Empregado para adaptar os sensores legados à interface comum `Sensor`, permitindo o uso polimórfico e a redução do acoplamento com `SensorManager`.
### Decorator
 Utilizado para adicionar funcionalidades dinâmicas aos sensores, como:
  Log de leitura (`SensorComLog`)
  Verificação de limites críticos (`SensorComAlerta`)
  


###  Factory Method
Usado para encapsular a criação de sensores, permitindo maior flexibilidade e padronização.

### Singleton
Aplicado à `SensorFactory` para garantir uma única instância da fábrica de sensores durante toda a execução do sistema.


---

##  Ganhos com a Refatoração

### Redução de Acoplamento
`SensorManager` não depende mais diretamente de implementações concretas de sensores.
Alterações em sensores ou no display não exigem mudanças no código principal.

### Aumento de Coesão
  Cada classe possui responsabilidade única
  Sensores lidam apenas com leitura.
  Adapters convertem interfaces legadas.
  Decorators adicionam comportamentos extras.


### Extensibilidade e Manutenção
- É possível adicionar novos sensores, exibições ou funcionalidades sem alterar o código existente (princípio aberto/fechado).

---

