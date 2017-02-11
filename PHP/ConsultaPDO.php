<?php
/**
 * A questão refere-se a em uma simples listagem de dados
 * a partir do banco de dados MySQL listagem de dados usando PDO
 *
 * @author Ack Lay (cleidimarviana@gmail.com)
 * 
 * Questão: http://pt.stackoverflow.com/questions/183489
 * */


// Instancia o objeto PDO
$pdo = new PDO('mysql:host=localhost;dbname=db', 'root', '');

// define para que o PDO lance exceções caso ocorra erros
$pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

$consulta = $pdo->query("SELECT fullname, email FROM user;");

while ($linha = $consulta->fetch(PDO::FETCH_ASSOC)) {
    
    // aqui eu mostro os valores de minha consulta
	echo "fullname: {$linha['fullname']} - email: {$linha['email']}<br />";
}
?>