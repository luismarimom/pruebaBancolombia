Feature: registro de un usuario en UTest
  como un usuario
  quiero registrarme en Utest
  para tener una cuenta nueva


  Scenario: registro exitoso de usuario nuevo
    Given Luis ingresa a la pagina web de Utest
    When cuando intenta registrarse con los siguientes datos
      | firstName  | luis                    |
      | lastName   | marimon                 |
      | email      | luismarimom@gmail.com   |
      | birthMonth | July                    |
      | birthDay   | 14                      |
      | birthYear  | 2000                    |
      | password   | 3105558844eldotorSantos |