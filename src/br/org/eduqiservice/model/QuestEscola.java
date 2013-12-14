package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the QUEST_ESCOLA database table.
 * 
 */
@Entity
@Table(name="QUEST_ESCOLA")
public class QuestEscola implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name="ID_DEPENDENCIA_ADM")
	private int idDependenciaAdm;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESCOLA")
	private Integer idEscola;

	@Column(name="ID_LOCALIZACAO")
	private int idLocalizacao;

	@Column(name="ID_MUNICIPIO")
	private Long idMunicipio;

	@Column(name="ID_PROVA_BRASIL")
	private int idProvaBrasil;

	@Column(name="ID_UF")
	private int idUf;

	@Column(name="IN_PREENCHIMENTO")
	private int inPreenchimento;

	@Column(name="TX_RESP_Q001")
	private char txRespQ001;

	@Column(name="TX_RESP_Q002")
	private char txRespQ002;

	@Column(name="TX_RESP_Q003")
	private char txRespQ003;

	@Column(name="TX_RESP_Q004")
	private char txRespQ004;

	@Column(name="TX_RESP_Q005")
	private char txRespQ005;

	@Column(name="TX_RESP_Q006")
	private char txRespQ006;

	@Column(name="TX_RESP_Q007")
	private char txRespQ007;

	@Column(name="TX_RESP_Q008")
	private char txRespQ008;

	@Column(name="TX_RESP_Q009")
	private char txRespQ009;

	@Column(name="TX_RESP_Q010")
	private char txRespQ010;

	@Column(name="TX_RESP_Q011")
	private char txRespQ011;

	@Column(name="TX_RESP_Q012")
	private char txRespQ012;

	@Column(name="TX_RESP_Q013")
	private char txRespQ013;

	@Column(name="TX_RESP_Q014")
	private char txRespQ014;

	@Column(name="TX_RESP_Q015")
	private char txRespQ015;

	@Column(name="TX_RESP_Q016")
	private char txRespQ016;

	@Column(name="TX_RESP_Q017")
	private char txRespQ017;

	@Column(name="TX_RESP_Q018")
	private char txRespQ018;

	@Column(name="TX_RESP_Q019")
	private char txRespQ019;

	@Column(name="TX_RESP_Q020")
	private char txRespQ020;

	@Column(name="TX_RESP_Q021")
	private char txRespQ021;

	@Column(name="TX_RESP_Q022")
	private char txRespQ022;

	@Column(name="TX_RESP_Q023")
	private char txRespQ023;

	@Column(name="TX_RESP_Q024")
	private char txRespQ024;

	@Column(name="TX_RESP_Q025")
	private char txRespQ025;

	@Column(name="TX_RESP_Q026")
	private char txRespQ026;

	@Column(name="TX_RESP_Q027")
	private char txRespQ027;

	@Column(name="TX_RESP_Q028")
	private char txRespQ028;

	@Column(name="TX_RESP_Q029")
	private char txRespQ029;

	@Column(name="TX_RESP_Q030")
	private char txRespQ030;

	@Column(name="TX_RESP_Q031")
	private char txRespQ031;

	@Column(name="TX_RESP_Q032")
	private char txRespQ032;

	@Column(name="TX_RESP_Q033")
	private char txRespQ033;

	@Column(name="TX_RESP_Q034")
	private char txRespQ034;

	@Column(name="TX_RESP_Q035")
	private char txRespQ035;

	@Column(name="TX_RESP_Q036")
	private char txRespQ036;

	@Column(name="TX_RESP_Q037")
	private char txRespQ037;

	@Column(name="TX_RESP_Q038")
	private char txRespQ038;

	@Column(name="TX_RESP_Q039")
	private char txRespQ039;

	@Column(name="TX_RESP_Q040")
	private char txRespQ040;

	@Column(name="TX_RESP_Q041")
	private char txRespQ041;

	@Column(name="TX_RESP_Q042")
	private char txRespQ042;

	@Column(name="TX_RESP_Q043")
	private char txRespQ043;

	@Column(name="TX_RESP_Q044")
	private char txRespQ044;

	@Column(name="TX_RESP_Q045")
	private char txRespQ045;

	@Column(name="TX_RESP_Q046")
	private char txRespQ046;

	@Column(name="TX_RESP_Q047")
	private char txRespQ047;

	@Column(name="TX_RESP_Q048")
	private char txRespQ048;

	@Column(name="TX_RESP_Q049")
	private char txRespQ049;

	@Column(name="TX_RESP_Q050")
	private char txRespQ050;

	@Column(name="TX_RESP_Q051")
	private char txRespQ051;

	@Column(name="TX_RESP_Q052")
	private char txRespQ052;

	@Column(name="TX_RESP_Q053")
	private char txRespQ053;

	@Column(name="TX_RESP_Q054")
	private char txRespQ054;

	@Column(name="TX_RESP_Q055")
	private char txRespQ055;

	@Column(name="TX_RESP_Q056")
	private char txRespQ056;

	@Column(name="TX_RESP_Q057")
	private char txRespQ057;

	@Column(name="TX_RESP_Q058")
	private char txRespQ058;

	@Column(name="TX_RESP_Q059")
	private char txRespQ059;

	@Column(name="TX_RESP_Q060")
	private char txRespQ060;

	@Column(name="TX_RESP_Q061")
	private char txRespQ061;

	@Column(name="TX_RESP_Q062")
	private char txRespQ062;

	@Column(name="TX_RESP_Q063")
	private char txRespQ063;

	@Column(name="TX_RESP_Q064")
	private char txRespQ064;

	@Column(name="TX_RESP_Q065")
	private char txRespQ065;

	@Column(name="TX_RESP_Q066")
	private char txRespQ066;

	public QuestEscola() {
	}

	public int getIdDependenciaAdm() {
		return this.idDependenciaAdm;
	}

	public void setIdDependenciaAdm(int idDependenciaAdm) {
		this.idDependenciaAdm = idDependenciaAdm;
	}

	public Integer getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(Integer idEscola) {
		this.idEscola = idEscola;
	}

	public int getIdLocalizacao() {
		return this.idLocalizacao;
	}

	public void setIdLocalizacao(int idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public Long getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public int getIdProvaBrasil() {
		return this.idProvaBrasil;
	}

	public void setIdProvaBrasil(int idProvaBrasil) {
		this.idProvaBrasil = idProvaBrasil;
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

	public char getTxRespQ001() {
		return this.txRespQ001;
	}

	public void setTxRespQ001(char txRespQ001) {
		this.txRespQ001 = txRespQ001;
	}

	public char getTxRespQ002() {
		return this.txRespQ002;
	}

	public void setTxRespQ002(char txRespQ002) {
		this.txRespQ002 = txRespQ002;
	}

	public char getTxRespQ003() {
		return this.txRespQ003;
	}

	public void setTxRespQ003(char txRespQ003) {
		this.txRespQ003 = txRespQ003;
	}

	public char getTxRespQ004() {
		return this.txRespQ004;
	}

	public void setTxRespQ004(char txRespQ004) {
		this.txRespQ004 = txRespQ004;
	}

	public char getTxRespQ005() {
		return this.txRespQ005;
	}

	public void setTxRespQ005(char txRespQ005) {
		this.txRespQ005 = txRespQ005;
	}

	public char getTxRespQ006() {
		return this.txRespQ006;
	}

	public void setTxRespQ006(char txRespQ006) {
		this.txRespQ006 = txRespQ006;
	}

	public char getTxRespQ007() {
		return this.txRespQ007;
	}

	public void setTxRespQ007(char txRespQ007) {
		this.txRespQ007 = txRespQ007;
	}

	public char getTxRespQ008() {
		return this.txRespQ008;
	}

	public void setTxRespQ008(char txRespQ008) {
		this.txRespQ008 = txRespQ008;
	}

	public char getTxRespQ009() {
		return this.txRespQ009;
	}

	public void setTxRespQ009(char txRespQ009) {
		this.txRespQ009 = txRespQ009;
	}

	public char getTxRespQ010() {
		return this.txRespQ010;
	}

	public void setTxRespQ010(char txRespQ010) {
		this.txRespQ010 = txRespQ010;
	}

	public char getTxRespQ011() {
		return this.txRespQ011;
	}

	public void setTxRespQ011(char txRespQ011) {
		this.txRespQ011 = txRespQ011;
	}

	public char getTxRespQ012() {
		return this.txRespQ012;
	}

	public void setTxRespQ012(char txRespQ012) {
		this.txRespQ012 = txRespQ012;
	}

	public char getTxRespQ013() {
		return this.txRespQ013;
	}

	public void setTxRespQ013(char txRespQ013) {
		this.txRespQ013 = txRespQ013;
	}

	public char getTxRespQ014() {
		return this.txRespQ014;
	}

	public void setTxRespQ014(char txRespQ014) {
		this.txRespQ014 = txRespQ014;
	}

	public char getTxRespQ015() {
		return this.txRespQ015;
	}

	public void setTxRespQ015(char txRespQ015) {
		this.txRespQ015 = txRespQ015;
	}

	public char getTxRespQ016() {
		return this.txRespQ016;
	}

	public void setTxRespQ016(char txRespQ016) {
		this.txRespQ016 = txRespQ016;
	}

	public char getTxRespQ017() {
		return this.txRespQ017;
	}

	public void setTxRespQ017(char txRespQ017) {
		this.txRespQ017 = txRespQ017;
	}

	public char getTxRespQ018() {
		return this.txRespQ018;
	}

	public void setTxRespQ018(char txRespQ018) {
		this.txRespQ018 = txRespQ018;
	}

	public char getTxRespQ019() {
		return this.txRespQ019;
	}

	public void setTxRespQ019(char txRespQ019) {
		this.txRespQ019 = txRespQ019;
	}

	public char getTxRespQ020() {
		return this.txRespQ020;
	}

	public void setTxRespQ020(char txRespQ020) {
		this.txRespQ020 = txRespQ020;
	}

	public char getTxRespQ021() {
		return this.txRespQ021;
	}

	public void setTxRespQ021(char txRespQ021) {
		this.txRespQ021 = txRespQ021;
	}

	public char getTxRespQ022() {
		return this.txRespQ022;
	}

	public void setTxRespQ022(char txRespQ022) {
		this.txRespQ022 = txRespQ022;
	}

	public char getTxRespQ023() {
		return this.txRespQ023;
	}

	public void setTxRespQ023(char txRespQ023) {
		this.txRespQ023 = txRespQ023;
	}

	public char getTxRespQ024() {
		return this.txRespQ024;
	}

	public void setTxRespQ024(char txRespQ024) {
		this.txRespQ024 = txRespQ024;
	}

	public char getTxRespQ025() {
		return this.txRespQ025;
	}

	public void setTxRespQ025(char txRespQ025) {
		this.txRespQ025 = txRespQ025;
	}

	public char getTxRespQ026() {
		return this.txRespQ026;
	}

	public void setTxRespQ026(char txRespQ026) {
		this.txRespQ026 = txRespQ026;
	}

	public char getTxRespQ027() {
		return this.txRespQ027;
	}

	public void setTxRespQ027(char txRespQ027) {
		this.txRespQ027 = txRespQ027;
	}

	public char getTxRespQ028() {
		return this.txRespQ028;
	}

	public void setTxRespQ028(char txRespQ028) {
		this.txRespQ028 = txRespQ028;
	}

	public char getTxRespQ029() {
		return this.txRespQ029;
	}

	public void setTxRespQ029(char txRespQ029) {
		this.txRespQ029 = txRespQ029;
	}

	public char getTxRespQ030() {
		return this.txRespQ030;
	}

	public void setTxRespQ030(char txRespQ030) {
		this.txRespQ030 = txRespQ030;
	}

	public char getTxRespQ031() {
		return this.txRespQ031;
	}

	public void setTxRespQ031(char txRespQ031) {
		this.txRespQ031 = txRespQ031;
	}

	public char getTxRespQ032() {
		return this.txRespQ032;
	}

	public void setTxRespQ032(char txRespQ032) {
		this.txRespQ032 = txRespQ032;
	}

	public char getTxRespQ033() {
		return this.txRespQ033;
	}

	public void setTxRespQ033(char txRespQ033) {
		this.txRespQ033 = txRespQ033;
	}

	public char getTxRespQ034() {
		return this.txRespQ034;
	}

	public void setTxRespQ034(char txRespQ034) {
		this.txRespQ034 = txRespQ034;
	}

	public char getTxRespQ035() {
		return this.txRespQ035;
	}

	public void setTxRespQ035(char txRespQ035) {
		this.txRespQ035 = txRespQ035;
	}

	public char getTxRespQ036() {
		return this.txRespQ036;
	}

	public void setTxRespQ036(char txRespQ036) {
		this.txRespQ036 = txRespQ036;
	}

	public char getTxRespQ037() {
		return this.txRespQ037;
	}

	public void setTxRespQ037(char txRespQ037) {
		this.txRespQ037 = txRespQ037;
	}

	public char getTxRespQ038() {
		return this.txRespQ038;
	}

	public void setTxRespQ038(char txRespQ038) {
		this.txRespQ038 = txRespQ038;
	}

	public char getTxRespQ039() {
		return this.txRespQ039;
	}

	public void setTxRespQ039(char txRespQ039) {
		this.txRespQ039 = txRespQ039;
	}

	public char getTxRespQ040() {
		return this.txRespQ040;
	}

	public void setTxRespQ040(char txRespQ040) {
		this.txRespQ040 = txRespQ040;
	}

	public char getTxRespQ041() {
		return this.txRespQ041;
	}

	public void setTxRespQ041(char txRespQ041) {
		this.txRespQ041 = txRespQ041;
	}

	public char getTxRespQ042() {
		return this.txRespQ042;
	}

	public void setTxRespQ042(char txRespQ042) {
		this.txRespQ042 = txRespQ042;
	}

	public char getTxRespQ043() {
		return this.txRespQ043;
	}

	public void setTxRespQ043(char txRespQ043) {
		this.txRespQ043 = txRespQ043;
	}

	public char getTxRespQ044() {
		return this.txRespQ044;
	}

	public void setTxRespQ044(char txRespQ044) {
		this.txRespQ044 = txRespQ044;
	}

	public char getTxRespQ045() {
		return this.txRespQ045;
	}

	public void setTxRespQ045(char txRespQ045) {
		this.txRespQ045 = txRespQ045;
	}

	public char getTxRespQ046() {
		return this.txRespQ046;
	}

	public void setTxRespQ046(char txRespQ046) {
		this.txRespQ046 = txRespQ046;
	}

	public char getTxRespQ047() {
		return this.txRespQ047;
	}

	public void setTxRespQ047(char txRespQ047) {
		this.txRespQ047 = txRespQ047;
	}

	public char getTxRespQ048() {
		return this.txRespQ048;
	}

	public void setTxRespQ048(char txRespQ048) {
		this.txRespQ048 = txRespQ048;
	}

	public char getTxRespQ049() {
		return this.txRespQ049;
	}

	public void setTxRespQ049(char txRespQ049) {
		this.txRespQ049 = txRespQ049;
	}

	public char getTxRespQ050() {
		return this.txRespQ050;
	}

	public void setTxRespQ050(char txRespQ050) {
		this.txRespQ050 = txRespQ050;
	}

	public char getTxRespQ051() {
		return this.txRespQ051;
	}

	public void setTxRespQ051(char txRespQ051) {
		this.txRespQ051 = txRespQ051;
	}

	public char getTxRespQ052() {
		return this.txRespQ052;
	}

	public void setTxRespQ052(char txRespQ052) {
		this.txRespQ052 = txRespQ052;
	}

	public char getTxRespQ053() {
		return this.txRespQ053;
	}

	public void setTxRespQ053(char txRespQ053) {
		this.txRespQ053 = txRespQ053;
	}

	public char getTxRespQ054() {
		return this.txRespQ054;
	}

	public void setTxRespQ054(char txRespQ054) {
		this.txRespQ054 = txRespQ054;
	}

	public char getTxRespQ055() {
		return this.txRespQ055;
	}

	public void setTxRespQ055(char txRespQ055) {
		this.txRespQ055 = txRespQ055;
	}

	public char getTxRespQ056() {
		return this.txRespQ056;
	}

	public void setTxRespQ056(char txRespQ056) {
		this.txRespQ056 = txRespQ056;
	}

	public char getTxRespQ057() {
		return this.txRespQ057;
	}

	public void setTxRespQ057(char txRespQ057) {
		this.txRespQ057 = txRespQ057;
	}

	public char getTxRespQ058() {
		return this.txRespQ058;
	}

	public void setTxRespQ058(char txRespQ058) {
		this.txRespQ058 = txRespQ058;
	}

	public char getTxRespQ059() {
		return this.txRespQ059;
	}

	public void setTxRespQ059(char txRespQ059) {
		this.txRespQ059 = txRespQ059;
	}

	public char getTxRespQ060() {
		return this.txRespQ060;
	}

	public void setTxRespQ060(char txRespQ060) {
		this.txRespQ060 = txRespQ060;
	}

	public char getTxRespQ061() {
		return this.txRespQ061;
	}

	public void setTxRespQ061(char txRespQ061) {
		this.txRespQ061 = txRespQ061;
	}

	public char getTxRespQ062() {
		return this.txRespQ062;
	}

	public void setTxRespQ062(char txRespQ062) {
		this.txRespQ062 = txRespQ062;
	}

	public char getTxRespQ063() {
		return this.txRespQ063;
	}

	public void setTxRespQ063(char txRespQ063) {
		this.txRespQ063 = txRespQ063;
	}

	public char getTxRespQ064() {
		return this.txRespQ064;
	}

	public void setTxRespQ064(char txRespQ064) {
		this.txRespQ064 = txRespQ064;
	}

	public char getTxRespQ065() {
		return this.txRespQ065;
	}

	public void setTxRespQ065(char txRespQ065) {
		this.txRespQ065 = txRespQ065;
	}

	public char getTxRespQ066() {
		return this.txRespQ066;
	}

	public void setTxRespQ066(char txRespQ066) {
		this.txRespQ066 = txRespQ066;
	}
	
}