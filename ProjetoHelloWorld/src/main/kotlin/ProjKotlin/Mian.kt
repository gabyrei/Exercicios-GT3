package ProjKotlin

import  projetokotlin.User
// Por falta de banco de dados o usuário já está cadastrado com e-mail raian.guilherme@gmailcom
// e senha 1234
// para fazer o login utilize, ou modifique na class
// ja utiliza uma opçao de login, e nao a de cadastro
divertido  principal () {
    var user1 =  User ( " " , " raian.guilherme " , " 77 " , " " , " " )
    println (
        " Olá!!! \n "  +
                " Bem vindo ao app Not + Hungry \n "  +
                " MENU \n "  +
                " 1-Cadastro \n "  +
                " 2-Login \n "
    )
    var resp = readln().toInt()
    quando (resp) {
        1  -> {
        println ( " ***Cadastro de novo usuário*** \n " )
        user1.cadastroUser()
        user1.loginUser()
    }
        2  -> {
        user1.loginUser()