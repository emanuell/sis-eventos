package br.com.fipgati.eventos.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Evento implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataInicio")
	private Calendar dataInicio;
	private String local;
	@OneToMany
	private List<Minicurso> listaMinicursos;
	@OneToMany
	private List<Palestra> listaPalestras;
	private BigDecimal preco;
	@ManyToMany
	private List<Patrocinador> listaPatrocinadores;
	private int vagas;
	@ManyToMany
	private List<Participante> listaInscritos;
	@ManyToMany
	private List<Usuario> organizadores;
	@Column(length=100000)
	private String descricao;
	@Column(length=100000)
	private String descricao2;

	private String abreviacao;

//	@ElementCollection
//	@CollectionTable(name = "caminho_imagens", joinColumns = @JoinColumn(name = "evento_id"))
//	@Column(name = "caminho")
//	@Fetch(FetchMode.SELECT)
//	private List<String> pathToImgSlides;
	
	private boolean imagens;

	private boolean status;
	private boolean finalizado;

	public Evento() {
	}

	public Evento(String nome, Calendar data) {
		listaMinicursos = new ArrayList<Minicurso>();
		listaPalestras = new ArrayList<Palestra>();
		listaPatrocinadores = new ArrayList<Patrocinador>();
		listaInscritos = new ArrayList<Participante>();

		this.nome = nome;
		dataInicio = data;
	}
	
	

	public boolean isImagens() {
		return imagens;
	}

	public void setImagens(boolean imagens) {
		this.imagens = imagens;
	}

	public String getAbreviacao() {
		return abreviacao;
	}

	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	public String getDescricao2() {
		return descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public List<Usuario> getOrganizadores() {
		return organizadores;
	}

	public void addMinicurso(Minicurso minicurso) {
		this.listaMinicursos.add(minicurso);
	}

	public void addPalestra(Palestra palestra) {
		this.listaPalestras.add(palestra);
	}

	public void addPatrocinador(Patrocinador patrocinador) {
		this.listaPatrocinadores.add(patrocinador);
	}

	public void removeMinicurso(Minicurso minicurso) {
		this.listaMinicursos.remove(minicurso);
	}

	public void removePalestra(Palestra palestra) {
		this.listaPalestras.remove(palestra);
	}

	public void removePatrocinador(Patrocinador patrocinador) {
		this.listaPatrocinadores.remove(patrocinador);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void addOrganizador(Usuario organizador) {
		this.organizadores.add(organizador);
	}

	public void removeOrganizador(Usuario organizador) {
		this.organizadores.remove(organizador);
	}

	public void setOrganizadores(List<Usuario> organizadores) {
		this.organizadores = organizadores;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

//	public void adicionarImagem(String path) {
//		pathToImgSlides.add(path);
//	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

//	public List<String> getPathToImgSlides() {
//		return pathToImgSlides;
//	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void adicionarMinicurso(Minicurso minicurso) {
		this.listaMinicursos.add(minicurso);
	}

	public void adicionarPalestra(Palestra palestra) {
		this.listaPalestras.add(palestra);
	}

	public void adicionarPatrocinador(Patrocinador patrocinador) {
		this.listaPatrocinadores.add(patrocinador);
	}

	public void adicionarInscrito(Participante inscrito) {
		this.listaInscritos.add(inscrito);
	}

	public List<Minicurso> getListaMinicursos() {
		return listaMinicursos;
	}

	public List<Palestra> getListaPalestras() {
		return listaPalestras;
	}

	public List<Patrocinador> getListaPatrocinadores() {
		return listaPatrocinadores;
	}

	public List<Participante> getListaInscritos() {
		return listaInscritos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

}
