package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the QUEST_ALUNO database table.
 * 
 */
@Entity
@Table(name="QUEST_ALUNO")
public class QuestAluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ALUNO")
	private BigInteger idAluno;

	@Column(name="ID_DEPENDENCIA_ADM")
	private int idDependenciaAdm;

	@Column(name="ID_ESCOLA")
	private BigInteger idEscola;

	@Column(name="ID_LOCALIZACAO")
	private int idLocalizacao;

	@Column(name="ID_MUNICIPIO")
	private BigInteger idMunicipio;

	@Column(name="ID_PROVA_BRASIL")
	private int idProvaBrasil;

	@Column(name="ID_SERIE")
	private int idSerie;

	@Column(name="ID_TURMA")
	private BigInteger idTurma;

	@Column(name="ID_TURNO")
	private int idTurno;

	@Column(name="ID_UF")
	private int idUf;

	@Column(name="IN_PREENCHIMENTO")
	private int inPreenchimento;

	@Column(name="IN_SITUACAO_CENSO")
	private int inSituacaoCenso;

	@Column(name="TX_RESP_Q001")
	private String txRespQ001;

	@Column(name="TX_RESP_Q002")
	private String txRespQ002;

	@Column(name="TX_RESP_Q003")
	private String txRespQ003;

	@Column(name="TX_RESP_Q004")
	private String txRespQ004;

	@Column(name="TX_RESP_Q005")
	private String txRespQ005;

	@Column(name="TX_RESP_Q006")
	private String txRespQ006;

	@Column(name="TX_RESP_Q007")
	private String txRespQ007;

	@Column(name="TX_RESP_Q008")
	private String txRespQ008;

	@Column(name="TX_RESP_Q009")
	private String txRespQ009;

	@Column(name="TX_RESP_Q010")
	private String txRespQ010;

	@Column(name="TX_RESP_Q011")
	private String txRespQ011;

	@Column(name="TX_RESP_Q012")
	private String txRespQ012;

	@Column(name="TX_RESP_Q013")
	private String txRespQ013;

	@Column(name="TX_RESP_Q014")
	private String txRespQ014;

	@Column(name="TX_RESP_Q015")
	private String txRespQ015;

	@Column(name="TX_RESP_Q016")
	private String txRespQ016;

	@Column(name="TX_RESP_Q017")
	private String txRespQ017;

	@Column(name="TX_RESP_Q018")
	private String txRespQ018;

	@Column(name="TX_RESP_Q019")
	private String txRespQ019;

	@Column(name="TX_RESP_Q020")
	private String txRespQ020;

	@Column(name="TX_RESP_Q021")
	private String txRespQ021;

	@Column(name="TX_RESP_Q022")
	private String txRespQ022;

	@Column(name="TX_RESP_Q023")
	private String txRespQ023;

	@Column(name="TX_RESP_Q024")
	private String txRespQ024;

	@Column(name="TX_RESP_Q025")
	private String txRespQ025;

	@Column(name="TX_RESP_Q026")
	private String txRespQ026;

	@Column(name="TX_RESP_Q027")
	private String txRespQ027;

	@Column(name="TX_RESP_Q028")
	private String txRespQ028;

	@Column(name="TX_RESP_Q029")
	private String txRespQ029;

	@Column(name="TX_RESP_Q030")
	private String txRespQ030;

	@Column(name="TX_RESP_Q031")
	private String txRespQ031;

	@Column(name="TX_RESP_Q032")
	private String txRespQ032;

	@Column(name="TX_RESP_Q033")
	private String txRespQ033;

	@Column(name="TX_RESP_Q034")
	private String txRespQ034;

	@Column(name="TX_RESP_Q035")
	private String txRespQ035;

	@Column(name="TX_RESP_Q036")
	private String txRespQ036;

	@Column(name="TX_RESP_Q037")
	private String txRespQ037;

	@Column(name="TX_RESP_Q038")
	private String txRespQ038;

	@Column(name="TX_RESP_Q039")
	private String txRespQ039;

	@Column(name="TX_RESP_Q040")
	private String txRespQ040;

	@Column(name="TX_RESP_Q041")
	private String txRespQ041;

	@Column(name="TX_RESP_Q042")
	private String txRespQ042;

	@Column(name="TX_RESP_Q043")
	private String txRespQ043;

	@Column(name="TX_RESP_Q044")
	private String txRespQ044;

	@Column(name="TX_RESP_Q045")
	private String txRespQ045;

	@Column(name="TX_RESP_Q046")
	private String txRespQ046;

	@Column(name="TX_RESP_Q047")
	private String txRespQ047;

	@Column(name="TX_RESP_Q048")
	private String txRespQ048;

	@Column(name="TX_RESP_Q049")
	private String txRespQ049;

	@Column(name="TX_RESP_Q050")
	private String txRespQ050;

	@Column(name="TX_RESP_Q051")
	private String txRespQ051;

	@Column(name="TX_RESP_Q052")
	private String txRespQ052;

	@Column(name="TX_RESP_Q053")
	private String txRespQ053;

	@Column(name="TX_RESP_Q054")
	private String txRespQ054;

	@Column(name="TX_RESP_Q055")
	private String txRespQ055;

	@Column(name="TX_RESP_Q056")
	private String txRespQ056;

	@Column(name="TX_RESP_Q057")
	private String txRespQ057;

	@Column(name="TX_RESP_Q058")
	private String txRespQ058;

	public QuestAluno() {
	}

	public BigInteger getIdAluno() {
		return this.idAluno;
	}

	public void setIdAluno(BigInteger idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdDependenciaAdm() {
		return this.idDependenciaAdm;
	}

	public void setIdDependenciaAdm(int idDependenciaAdm) {
		this.idDependenciaAdm = idDependenciaAdm;
	}

	public BigInteger getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(BigInteger idEscola) {
		this.idEscola = idEscola;
	}

	public int getIdLocalizacao() {
		return this.idLocalizacao;
	}

	public void setIdLocalizacao(int idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public BigInteger getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(BigInteger idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public int getIdProvaBrasil() {
		return this.idProvaBrasil;
	}

	public void setIdProvaBrasil(int idProvaBrasil) {
		this.idProvaBrasil = idProvaBrasil;
	}

	public int getIdSerie() {
		return this.idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public BigInteger getIdTurma() {
		return this.idTurma;
	}

	public void setIdTurma(BigInteger idTurma) {
		this.idTurma = idTurma;
	}

	public int getIdTurno() {
		return this.idTurno;
	}

	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}

	public int getIdUf() {
		return this.idUf;
	}

	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}

	public int getInPreenchimento() {
		return this.inPreenchimento;
	}

	public void setInPreenchimento(int inPreenchimento) {
		this.inPreenchimento = inPreenchimento;
	}

	public int getInSituacaoCenso() {
		return this.inSituacaoCenso;
	}

	public void setInSituacaoCenso(int inSituacaoCenso) {
		this.inSituacaoCenso = inSituacaoCenso;
	}

	public String getTxRespQ001() {
		return this.txRespQ001;
	}

	public void setTxRespQ001(String txRespQ001) {
		this.txRespQ001 = txRespQ001;
	}

	public String getTxRespQ002() {
		return this.txRespQ002;
	}

	public void setTxRespQ002(String txRespQ002) {
		this.txRespQ002 = txRespQ002;
	}

	public String getTxRespQ003() {
		return this.txRespQ003;
	}

	public void setTxRespQ003(String txRespQ003) {
		this.txRespQ003 = txRespQ003;
	}

	public String getTxRespQ004() {
		return this.txRespQ004;
	}

	public void setTxRespQ004(String txRespQ004) {
		this.txRespQ004 = txRespQ004;
	}

	public String getTxRespQ005() {
		return this.txRespQ005;
	}

	public void setTxRespQ005(String txRespQ005) {
		this.txRespQ005 = txRespQ005;
	}

	public String getTxRespQ006() {
		return this.txRespQ006;
	}

	public void setTxRespQ006(String txRespQ006) {
		this.txRespQ006 = txRespQ006;
	}

	public String getTxRespQ007() {
		return this.txRespQ007;
	}

	public void setTxRespQ007(String txRespQ007) {
		this.txRespQ007 = txRespQ007;
	}

	public String getTxRespQ008() {
		return this.txRespQ008;
	}

	public void setTxRespQ008(String txRespQ008) {
		this.txRespQ008 = txRespQ008;
	}

	public String getTxRespQ009() {
		return this.txRespQ009;
	}

	public void setTxRespQ009(String txRespQ009) {
		this.txRespQ009 = txRespQ009;
	}

	public String getTxRespQ010() {
		return this.txRespQ010;
	}

	public void setTxRespQ010(String txRespQ010) {
		this.txRespQ010 = txRespQ010;
	}

	public String getTxRespQ011() {
		return this.txRespQ011;
	}

	public void setTxRespQ011(String txRespQ011) {
		this.txRespQ011 = txRespQ011;
	}

	public String getTxRespQ012() {
		return this.txRespQ012;
	}

	public void setTxRespQ012(String txRespQ012) {
		this.txRespQ012 = txRespQ012;
	}

	public String getTxRespQ013() {
		return this.txRespQ013;
	}

	public void setTxRespQ013(String txRespQ013) {
		this.txRespQ013 = txRespQ013;
	}

	public String getTxRespQ014() {
		return this.txRespQ014;
	}

	public void setTxRespQ014(String txRespQ014) {
		this.txRespQ014 = txRespQ014;
	}

	public String getTxRespQ015() {
		return this.txRespQ015;
	}

	public void setTxRespQ015(String txRespQ015) {
		this.txRespQ015 = txRespQ015;
	}

	public String getTxRespQ016() {
		return this.txRespQ016;
	}

	public void setTxRespQ016(String txRespQ016) {
		this.txRespQ016 = txRespQ016;
	}

	public String getTxRespQ017() {
		return this.txRespQ017;
	}

	public void setTxRespQ017(String txRespQ017) {
		this.txRespQ017 = txRespQ017;
	}

	public String getTxRespQ018() {
		return this.txRespQ018;
	}

	public void setTxRespQ018(String txRespQ018) {
		this.txRespQ018 = txRespQ018;
	}

	public String getTxRespQ019() {
		return this.txRespQ019;
	}

	public void setTxRespQ019(String txRespQ019) {
		this.txRespQ019 = txRespQ019;
	}

	public String getTxRespQ020() {
		return this.txRespQ020;
	}

	public void setTxRespQ020(String txRespQ020) {
		this.txRespQ020 = txRespQ020;
	}

	public String getTxRespQ021() {
		return this.txRespQ021;
	}

	public void setTxRespQ021(String txRespQ021) {
		this.txRespQ021 = txRespQ021;
	}

	public String getTxRespQ022() {
		return this.txRespQ022;
	}

	public void setTxRespQ022(String txRespQ022) {
		this.txRespQ022 = txRespQ022;
	}

	public String getTxRespQ023() {
		return this.txRespQ023;
	}

	public void setTxRespQ023(String txRespQ023) {
		this.txRespQ023 = txRespQ023;
	}

	public String getTxRespQ024() {
		return this.txRespQ024;
	}

	public void setTxRespQ024(String txRespQ024) {
		this.txRespQ024 = txRespQ024;
	}

	public String getTxRespQ025() {
		return this.txRespQ025;
	}

	public void setTxRespQ025(String txRespQ025) {
		this.txRespQ025 = txRespQ025;
	}

	public String getTxRespQ026() {
		return this.txRespQ026;
	}

	public void setTxRespQ026(String txRespQ026) {
		this.txRespQ026 = txRespQ026;
	}

	public String getTxRespQ027() {
		return this.txRespQ027;
	}

	public void setTxRespQ027(String txRespQ027) {
		this.txRespQ027 = txRespQ027;
	}

	public String getTxRespQ028() {
		return this.txRespQ028;
	}

	public void setTxRespQ028(String txRespQ028) {
		this.txRespQ028 = txRespQ028;
	}

	public String getTxRespQ029() {
		return this.txRespQ029;
	}

	public void setTxRespQ029(String txRespQ029) {
		this.txRespQ029 = txRespQ029;
	}

	public String getTxRespQ030() {
		return this.txRespQ030;
	}

	public void setTxRespQ030(String txRespQ030) {
		this.txRespQ030 = txRespQ030;
	}

	public String getTxRespQ031() {
		return this.txRespQ031;
	}

	public void setTxRespQ031(String txRespQ031) {
		this.txRespQ031 = txRespQ031;
	}

	public String getTxRespQ032() {
		return this.txRespQ032;
	}

	public void setTxRespQ032(String txRespQ032) {
		this.txRespQ032 = txRespQ032;
	}

	public String getTxRespQ033() {
		return this.txRespQ033;
	}

	public void setTxRespQ033(String txRespQ033) {
		this.txRespQ033 = txRespQ033;
	}

	public String getTxRespQ034() {
		return this.txRespQ034;
	}

	public void setTxRespQ034(String txRespQ034) {
		this.txRespQ034 = txRespQ034;
	}

	public String getTxRespQ035() {
		return this.txRespQ035;
	}

	public void setTxRespQ035(String txRespQ035) {
		this.txRespQ035 = txRespQ035;
	}

	public String getTxRespQ036() {
		return this.txRespQ036;
	}

	public void setTxRespQ036(String txRespQ036) {
		this.txRespQ036 = txRespQ036;
	}

	public String getTxRespQ037() {
		return this.txRespQ037;
	}

	public void setTxRespQ037(String txRespQ037) {
		this.txRespQ037 = txRespQ037;
	}

	public String getTxRespQ038() {
		return this.txRespQ038;
	}

	public void setTxRespQ038(String txRespQ038) {
		this.txRespQ038 = txRespQ038;
	}

	public String getTxRespQ039() {
		return this.txRespQ039;
	}

	public void setTxRespQ039(String txRespQ039) {
		this.txRespQ039 = txRespQ039;
	}

	public String getTxRespQ040() {
		return this.txRespQ040;
	}

	public void setTxRespQ040(String txRespQ040) {
		this.txRespQ040 = txRespQ040;
	}

	public String getTxRespQ041() {
		return this.txRespQ041;
	}

	public void setTxRespQ041(String txRespQ041) {
		this.txRespQ041 = txRespQ041;
	}

	public String getTxRespQ042() {
		return this.txRespQ042;
	}

	public void setTxRespQ042(String txRespQ042) {
		this.txRespQ042 = txRespQ042;
	}

	public String getTxRespQ043() {
		return this.txRespQ043;
	}

	public void setTxRespQ043(String txRespQ043) {
		this.txRespQ043 = txRespQ043;
	}

	public String getTxRespQ044() {
		return this.txRespQ044;
	}

	public void setTxRespQ044(String txRespQ044) {
		this.txRespQ044 = txRespQ044;
	}

	public String getTxRespQ045() {
		return this.txRespQ045;
	}

	public void setTxRespQ045(String txRespQ045) {
		this.txRespQ045 = txRespQ045;
	}

	public String getTxRespQ046() {
		return this.txRespQ046;
	}

	public void setTxRespQ046(String txRespQ046) {
		this.txRespQ046 = txRespQ046;
	}

	public String getTxRespQ047() {
		return this.txRespQ047;
	}

	public void setTxRespQ047(String txRespQ047) {
		this.txRespQ047 = txRespQ047;
	}

	public String getTxRespQ048() {
		return this.txRespQ048;
	}

	public void setTxRespQ048(String txRespQ048) {
		this.txRespQ048 = txRespQ048;
	}

	public String getTxRespQ049() {
		return this.txRespQ049;
	}

	public void setTxRespQ049(String txRespQ049) {
		this.txRespQ049 = txRespQ049;
	}

	public String getTxRespQ050() {
		return this.txRespQ050;
	}

	public void setTxRespQ050(String txRespQ050) {
		this.txRespQ050 = txRespQ050;
	}

	public String getTxRespQ051() {
		return this.txRespQ051;
	}

	public void setTxRespQ051(String txRespQ051) {
		this.txRespQ051 = txRespQ051;
	}

	public String getTxRespQ052() {
		return this.txRespQ052;
	}

	public void setTxRespQ052(String txRespQ052) {
		this.txRespQ052 = txRespQ052;
	}

	public String getTxRespQ053() {
		return this.txRespQ053;
	}

	public void setTxRespQ053(String txRespQ053) {
		this.txRespQ053 = txRespQ053;
	}

	public String getTxRespQ054() {
		return this.txRespQ054;
	}

	public void setTxRespQ054(String txRespQ054) {
		this.txRespQ054 = txRespQ054;
	}

	public String getTxRespQ055() {
		return this.txRespQ055;
	}

	public void setTxRespQ055(String txRespQ055) {
		this.txRespQ055 = txRespQ055;
	}

	public String getTxRespQ056() {
		return this.txRespQ056;
	}

	public void setTxRespQ056(String txRespQ056) {
		this.txRespQ056 = txRespQ056;
	}

	public String getTxRespQ057() {
		return this.txRespQ057;
	}

	public void setTxRespQ057(String txRespQ057) {
		this.txRespQ057 = txRespQ057;
	}

	public String getTxRespQ058() {
		return this.txRespQ058;
	}

	public void setTxRespQ058(String txRespQ058) {
		this.txRespQ058 = txRespQ058;
	}

}