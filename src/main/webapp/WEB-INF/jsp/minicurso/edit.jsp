<form action="${linkTo[MinicursoController].update}" method="post">
	<div class="box">
		<%@include file="form.jsp"%>
		<div class="actions">
			<a href="${linkTo[MinicursoController].list[evento]}"
				class="btn btn-default">Voltar</a>
			<button type="submit" class="btn btn-default" name="_method"
				value="put">Salvar</button>
		</div>
	</div>
</form>