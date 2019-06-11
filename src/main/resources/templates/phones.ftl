<#import "/spring.ftl" as spring>
<html>
<h1>My products</h1>
<ul>
<#list phones as phone>
    <li>${phone}</li>
</#list>
</ul>
<br>
<a href="/logout">Logout</a>
</html>