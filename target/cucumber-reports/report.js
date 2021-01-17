$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/loginLogout.feature");
formatter.feature({
  "name": "Login e Logout sistema",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Login do sistema \u003cIdteste\u003e",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"\u003cuser\u003e\" e senha \"\u003csenha\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema apresenta \u003cIdteste\u003e e exibe \"\u003cretorno\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "user",
        "senha",
        "Idteste",
        "retorno"
      ]
    },
    {
      "cells": [
        "bruno.mesquita",
        "",
        "1",
        "Your account may be disabled or blocked or the username/password you entered is incorrect."
      ]
    },
    {
      "cells": [
        "",
        "B1993@mesq",
        "2",
        "Your account may be disabled or blocked or the username/password you entered is incorrect."
      ]
    },
    {
      "cells": [
        "bruno.mesq",
        "B1993@mesq",
        "3",
        "Your account may be disabled or blocked or the username/password you entered is incorrect."
      ]
    },
    {
      "cells": [
        "bruno.mesquita",
        "B1993@mesq",
        "4",
        "Logged in as: bruno.mesquita (Bruno Mesquita - reporter)"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login do sistema 1",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"bruno.mesquita\" e senha \"\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginLogoutSteps.queTentoAcessarOSistemaComOLoginESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginLogoutSteps.clicarNoBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta 1 e exibe \"Your account may be disabled or blocked or the username/password you entered is incorrect.\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginLogoutSteps.oSistemaApresentaEExibe(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login do sistema 2",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"\" e senha \"B1993@mesq\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginLogoutSteps.queTentoAcessarOSistemaComOLoginESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginLogoutSteps.clicarNoBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta 2 e exibe \"Your account may be disabled or blocked or the username/password you entered is incorrect.\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginLogoutSteps.oSistemaApresentaEExibe(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login do sistema 3",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"bruno.mesq\" e senha \"B1993@mesq\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginLogoutSteps.queTentoAcessarOSistemaComOLoginESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginLogoutSteps.clicarNoBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta 3 e exibe \"Your account may be disabled or blocked or the username/password you entered is incorrect.\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginLogoutSteps.oSistemaApresentaEExibe(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login do sistema 4",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"bruno.mesquita\" e senha \"B1993@mesq\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginLogoutSteps.queTentoAcessarOSistemaComOLoginESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginLogoutSteps.clicarNoBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta 4 e exibe \"Logged in as: bruno.mesquita (Bruno Mesquita - reporter)\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginLogoutSteps.oSistemaApresentaEExibe(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Logout do sistema \u003cIdtesteLog\u003e",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"\u003cuserLog\u003e\" e senha \"\u003csenhaLog\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema apresenta \u003cIdtesteLog\u003e e exibe \"\u003cretornoLog\u003e\"",
  "keyword": "Entao "
});
formatter.step({
  "name": "clicar no botao \"Logout\"",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema redireciona para a pagina inicial",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "userLog",
        "senhaLog",
        "IdtesteLog",
        "retornoLog"
      ]
    },
    {
      "cells": [
        "bruno.mesquita",
        "B1993@mesq",
        "5",
        "Logged in as: bruno.mesquita (Bruno Mesquita - reporter)"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logout do sistema 5",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@Logout"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que tento acessar o sistema com o login \"bruno.mesquita\" e senha \"B1993@mesq\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "LoginLogoutSteps.queTentoAcessarOSistemaComOLoginESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao \"Login\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginLogoutSteps.clicarNoBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta 5 e exibe \"Logged in as: bruno.mesquita (Bruno Mesquita - reporter)\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginLogoutSteps.oSistemaApresentaEExibe(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao \"Logout\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginLogoutSteps.clicarNoBotao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema redireciona para a pagina inicial",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginLogoutSteps.oSistemaRedirecionaParaAPaginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
});