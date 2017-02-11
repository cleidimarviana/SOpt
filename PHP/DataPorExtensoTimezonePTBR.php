<?php
/**
 * A questão refere-se a em uma simples escrita da data por extenso em português
 *
 * @author Ack Lay
 * 
 * Questão: http://pt.stackoverflow.com/questions/183518/
 * */
setlocale(LC_TIME, 'portuguese'); 
date_default_timezone_set('America/Sao_Paulo');

$date = date('Y-m-d');
echo strftime("%d de %B de %Y", strtotime($date));

?>