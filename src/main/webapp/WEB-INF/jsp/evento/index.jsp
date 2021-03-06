<div class="row">
	<div class="box">
		<div class="col-lg-12">
			<hr>
			<h2 class="intro-text text-center">
				Eventos <strong>Abertos</strong>
			</h2>
			<hr>
			<c:forEach items="${eventoList}" var="evento">
				<c:if test="${!evento.finalizado}">
					<div class="col-sm-4 text-center">
						<a href="${linkTo[EventoController].indexEvento[evento]}"><c:if
								test="${evento.capa}">
								<img class="img-responsive"
									src="${pageContext.request.contextPath}/arquivos/${evento.id}capa.jpg"
									alt="">
							</c:if> <c:if test="${!evento.capa}">
								<img class="img-responsive"
									src="http://placehold.it/750x450"
									alt="">
							</c:if> </a>
						<h3>
							${evento.abreviacao} <small><fmt:formatDate
									dateStyle="short" value="${evento.dataInicio.time}" /></small>
						</h3>
						<c:if test="${usuarioWeb.logado}">
							<a class="btn btn-default btn-sm"
								href="${linkTo[EventoController].edit[evento]}"
								title="Editar Evento"> <span
								class="glyphicon glyphicon-pencil"></span>

							</a>
							<a class="btn btn-default btn-sm"
								href="${linkTo[EventoController].gerenciaEvento[evento]}"
								title="Editar Evento"> <span class="glyphicon glyphicon-cog"></span>
							</a>
							<c:choose>
								<c:when test="${evento.status}">
									<a class="btn btn-default btn-sm"
										href="${linkTo[EventoController].fechar[evento]}"
										title="Fechar Evento"
										onclick="return confirm('Tem certeza que deseja abrir o evento?')">
										<span class="glyphicon glyphicon-remove"></span>
									</a>
								</c:when>
								<c:otherwise>
									<a class="btn btn-default btn-sm"
										href="${linkTo[EventoController].abrir[evento]}"
										title="Abrir Evento"
										onclick="return confirm('Tem certeza que deseja abrir o evento?')">
										<span class="glyphicon glyphicon-ok"></span>
									</a>
								</c:otherwise>
							</c:choose>
							<a class="btn btn-default btn-sm"
								href="${linkTo[EventoController].finalizar[evento]}"
								title="Finalizar Evento"
								onclick="return confirm('Tem certeza que deseja finalizar o evento?')">
								<span class="glyphicon glyphicon-ok-circle"></span>
							</a>
							<a class="btn btn-default btn-sm"
								href="${linkTo[EventoController].destroy[evento]}"
								title="Excluir Evento"
								onclick="return confirm('Tem certeza que deseja excluir o evento?')">
								<span class="glyphicon glyphicon-remove-sign"></span>
							</a>
						</c:if>



					</div>
				</c:if>
			</c:forEach>
			<div class="clearfix"></div>
		</div>
	</div>
	<div class="box">
		<div class="col-lg-12">
			<hr>
			<h2 class="intro-text text-center">
				Eventos <strong>finalizados</strong>
			</h2>
			<hr>
			<c:forEach items="${eventoList}" var="evento">
				<c:if test="${evento.finalizado}">
					<div class="col-sm-4 text-center">
						<a href="${linkTo[EventoController].indexEvento[evento]}"><c:if
								test="${evento.capa}">
								<img class="img-responsive"
									src="${pageContext.request.contextPath}/arquivos/${evento.id}capa.jpg"
									alt="">
							</c:if> <c:if test="${!evento.capa}">
								<img class="img-responsive"
									src="http://placehold.it/750x450"
									alt="">
							</c:if> </a>
						<h3>
							${evento.abreviacao} <small><fmt:formatDate dateStyle="short"
									value="${evento.dataInicio.time}" /></small>
						</h3>
						<a class="btn btn-default btn-sm"
							href="${linkTo[EventoController].destroy[evento]}"
							title="Excluir Evento"
							onclick="return confirm('Tem certeza que deseja excluir o evento?')">
							<span class="glyphicon glyphicon-remove-sign"></span>
						</a>
					</div>
				</c:if>
			</c:forEach>
			<div class="clearfix"></div>
		</div>
	</div>
	<c:if test="${usuarioWeb.logado}">
	<a class="btn btn-default btn-sm"
		href="${linkTo[EventoController].newEvento}" title="Adicionar Evento">
		<span class="glyphicon glyphicon-plus"> Evento</span>
	</a>
	</c:if>

</div>