<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tabulation</title>
</head>
<body>

<h1>Tabulation Form:</h1>
<form method="post" action="main">
    <table>
        <tr>
            <td><label for="start">Start:</label></td>
            <td><input id="start" type="number" name="startParam" step="0.01"></td>
        </tr>
        <tr>
            <td><label for="finish">Finish:</label></td>
            <td><input id="finish" type="number" name="finishParam" step="0.01"></td>
        </tr>
        <tr>
            <td><label for="step">Step:</label></td>
            <td><input id="step" type="number" name="stepParam" step="0.01"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Calculate"></td>
        </tr>
    </table>
</form>


<h1>Multiplication Table:</h1>
<form method="post" action="main2">
    <table>
        <tr>
            <td><label for="num1">Num1:</label></td>
            <td><input id="num1" type="number" name="number1"></td>
        </tr>
        <tr>
            <td><label for="num2">Num2:</label></td>
            <td><input id="num2" type="number" name="number2"></td>>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Calculate"></td>
        </tr>

    </table>
</form>

</body>
</html>