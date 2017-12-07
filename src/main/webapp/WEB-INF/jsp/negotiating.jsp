<html>
<head>
</head>

<body>
<h2>
This is jsp for Content Negotiating Controller.
</h2>

<p>
${articles.getFirst().getTitle()}
<br/>
${articles.getFirst().getUrl()}
<br/>
${articles.getFirst().getCategories()}
<br/>
${articles.getFirst().getTags()}
</p>
</body>
</html>