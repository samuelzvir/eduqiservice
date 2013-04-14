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
	private Integer idMunicipio;

	@Column(name="ID_PROVA_BRASIL")
	private int idProvaBrasil;

	@Column(name="ID_UF")
	private int idUf;

	@Column(name="IN_PREENCHIMENTO")
	private int inPreenchimento;

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

	@Column(name="TX_RESP_Q059")
	private String txRespQ059;

	@Column(name="TX_RESP_Q060")
	private String txRespQ060;

	@Column(name="TX_RESP_Q061")
	private String txRespQ061;

	@Column(name="TX_RESP_Q062")
	private String txRespQ062;

	@Column(name="TX_RESP_Q063")
	private String txRespQ063;

	@Column(name="TX_RESP_Q064")
	private String txRespQ064;

	@Column(name="TX_RESP_Q065")
	private String txRespQ065;

	@Column(name="TX_RESP_Q066")
	private String txRespQ066;

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

	public Integer getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
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

	public String getTxRespQ059() {
		return this.txRespQ059;
	}

	public void setTxRespQ059(String txRespQ059) {
		this.txRespQ059 = txRespQ059;
	}

	public String getTxRespQ060() {
		return this.txRespQ060;
	}

	public void setTxRespQ060(String txRespQ060) {
		this.txRespQ060 = txRespQ060;
	}

	public String getTxRespQ061() {
		return this.txRespQ061;
	}

	public void setTxRespQ061(String txRespQ061) {
		this.txRespQ061 = txRespQ061;
	}

	public String getTxRespQ062() {
		return this.txRespQ062;
	}

	public void setTxRespQ062(String txRespQ062) {
		this.txRespQ062 = txRespQ062;
	}

	public String getTxRespQ063() {
		return this.txRespQ063;
	}

	public void setTxRespQ063(String txRespQ063) {
		this.txRespQ063 = txRespQ063;
	}

	public String getTxRespQ064() {
		return this.txRespQ064;
	}

	public void setTxRespQ064(String txRespQ064) {
		this.txRespQ064 = txRespQ064;
	}

	public String getTxRespQ065() {
		return this.txRespQ065;
	}

	public void setTxRespQ065(String txRespQ065) {
		this.txRespQ065 = txRespQ065;
	}

	public String getTxRespQ066() {
		return this.txRespQ066;
	}

	public void setTxRespQ066(String txRespQ066) {
		this.txRespQ066 = txRespQ066;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDependenciaAdm;
		result = prime * result
				+ ((idEscola == null) ? 0 : idEscola.hashCode());
		result = prime * result + idLocalizacao;
		result = prime * result
				+ ((idMunicipio == null) ? 0 : idMunicipio.hashCode());
		result = prime * result + idProvaBrasil;
		result = prime * result + idUf;
		result = prime * result + inPreenchimento;
		result = prime * result
				+ ((txRespQ001 == null) ? 0 : txRespQ001.hashCode());
		result = prime * result
				+ ((txRespQ002 == null) ? 0 : txRespQ002.hashCode());
		result = prime * result
				+ ((txRespQ003 == null) ? 0 : txRespQ003.hashCode());
		result = prime * result
				+ ((txRespQ004 == null) ? 0 : txRespQ004.hashCode());
		result = prime * result
				+ ((txRespQ005 == null) ? 0 : txRespQ005.hashCode());
		result = prime * result
				+ ((txRespQ006 == null) ? 0 : txRespQ006.hashCode());
		result = prime * result
				+ ((txRespQ007 == null) ? 0 : txRespQ007.hashCode());
		result = prime * result
				+ ((txRespQ008 == null) ? 0 : txRespQ008.hashCode());
		result = prime * result
				+ ((txRespQ009 == null) ? 0 : txRespQ009.hashCode());
		result = prime * result
				+ ((txRespQ010 == null) ? 0 : txRespQ010.hashCode());
		result = prime * result
				+ ((txRespQ011 == null) ? 0 : txRespQ011.hashCode());
		result = prime * result
				+ ((txRespQ012 == null) ? 0 : txRespQ012.hashCode());
		result = prime * result
				+ ((txRespQ013 == null) ? 0 : txRespQ013.hashCode());
		result = prime * result
				+ ((txRespQ014 == null) ? 0 : txRespQ014.hashCode());
		result = prime * result
				+ ((txRespQ015 == null) ? 0 : txRespQ015.hashCode());
		result = prime * result
				+ ((txRespQ016 == null) ? 0 : txRespQ016.hashCode());
		result = prime * result
				+ ((txRespQ017 == null) ? 0 : txRespQ017.hashCode());
		result = prime * result
				+ ((txRespQ018 == null) ? 0 : txRespQ018.hashCode());
		result = prime * result
				+ ((txRespQ019 == null) ? 0 : txRespQ019.hashCode());
		result = prime * result
				+ ((txRespQ020 == null) ? 0 : txRespQ020.hashCode());
		result = prime * result
				+ ((txRespQ021 == null) ? 0 : txRespQ021.hashCode());
		result = prime * result
				+ ((txRespQ022 == null) ? 0 : txRespQ022.hashCode());
		result = prime * result
				+ ((txRespQ023 == null) ? 0 : txRespQ023.hashCode());
		result = prime * result
				+ ((txRespQ024 == null) ? 0 : txRespQ024.hashCode());
		result = prime * result
				+ ((txRespQ025 == null) ? 0 : txRespQ025.hashCode());
		result = prime * result
				+ ((txRespQ026 == null) ? 0 : txRespQ026.hashCode());
		result = prime * result
				+ ((txRespQ027 == null) ? 0 : txRespQ027.hashCode());
		result = prime * result
				+ ((txRespQ028 == null) ? 0 : txRespQ028.hashCode());
		result = prime * result
				+ ((txRespQ029 == null) ? 0 : txRespQ029.hashCode());
		result = prime * result
				+ ((txRespQ030 == null) ? 0 : txRespQ030.hashCode());
		result = prime * result
				+ ((txRespQ031 == null) ? 0 : txRespQ031.hashCode());
		result = prime * result
				+ ((txRespQ032 == null) ? 0 : txRespQ032.hashCode());
		result = prime * result
				+ ((txRespQ033 == null) ? 0 : txRespQ033.hashCode());
		result = prime * result
				+ ((txRespQ034 == null) ? 0 : txRespQ034.hashCode());
		result = prime * result
				+ ((txRespQ035 == null) ? 0 : txRespQ035.hashCode());
		result = prime * result
				+ ((txRespQ036 == null) ? 0 : txRespQ036.hashCode());
		result = prime * result
				+ ((txRespQ037 == null) ? 0 : txRespQ037.hashCode());
		result = prime * result
				+ ((txRespQ038 == null) ? 0 : txRespQ038.hashCode());
		result = prime * result
				+ ((txRespQ039 == null) ? 0 : txRespQ039.hashCode());
		result = prime * result
				+ ((txRespQ040 == null) ? 0 : txRespQ040.hashCode());
		result = prime * result
				+ ((txRespQ041 == null) ? 0 : txRespQ041.hashCode());
		result = prime * result
				+ ((txRespQ042 == null) ? 0 : txRespQ042.hashCode());
		result = prime * result
				+ ((txRespQ043 == null) ? 0 : txRespQ043.hashCode());
		result = prime * result
				+ ((txRespQ044 == null) ? 0 : txRespQ044.hashCode());
		result = prime * result
				+ ((txRespQ045 == null) ? 0 : txRespQ045.hashCode());
		result = prime * result
				+ ((txRespQ046 == null) ? 0 : txRespQ046.hashCode());
		result = prime * result
				+ ((txRespQ047 == null) ? 0 : txRespQ047.hashCode());
		result = prime * result
				+ ((txRespQ048 == null) ? 0 : txRespQ048.hashCode());
		result = prime * result
				+ ((txRespQ049 == null) ? 0 : txRespQ049.hashCode());
		result = prime * result
				+ ((txRespQ050 == null) ? 0 : txRespQ050.hashCode());
		result = prime * result
				+ ((txRespQ051 == null) ? 0 : txRespQ051.hashCode());
		result = prime * result
				+ ((txRespQ052 == null) ? 0 : txRespQ052.hashCode());
		result = prime * result
				+ ((txRespQ053 == null) ? 0 : txRespQ053.hashCode());
		result = prime * result
				+ ((txRespQ054 == null) ? 0 : txRespQ054.hashCode());
		result = prime * result
				+ ((txRespQ055 == null) ? 0 : txRespQ055.hashCode());
		result = prime * result
				+ ((txRespQ056 == null) ? 0 : txRespQ056.hashCode());
		result = prime * result
				+ ((txRespQ057 == null) ? 0 : txRespQ057.hashCode());
		result = prime * result
				+ ((txRespQ058 == null) ? 0 : txRespQ058.hashCode());
		result = prime * result
				+ ((txRespQ059 == null) ? 0 : txRespQ059.hashCode());
		result = prime * result
				+ ((txRespQ060 == null) ? 0 : txRespQ060.hashCode());
		result = prime * result
				+ ((txRespQ061 == null) ? 0 : txRespQ061.hashCode());
		result = prime * result
				+ ((txRespQ062 == null) ? 0 : txRespQ062.hashCode());
		result = prime * result
				+ ((txRespQ063 == null) ? 0 : txRespQ063.hashCode());
		result = prime * result
				+ ((txRespQ064 == null) ? 0 : txRespQ064.hashCode());
		result = prime * result
				+ ((txRespQ065 == null) ? 0 : txRespQ065.hashCode());
		result = prime * result
				+ ((txRespQ066 == null) ? 0 : txRespQ066.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestEscola other = (QuestEscola) obj;
		if (idDependenciaAdm != other.idDependenciaAdm)
			return false;
		if (idEscola == null) {
			if (other.idEscola != null)
				return false;
		} else if (!idEscola.equals(other.idEscola))
			return false;
		if (idLocalizacao != other.idLocalizacao)
			return false;
		if (idMunicipio == null) {
			if (other.idMunicipio != null)
				return false;
		} else if (!idMunicipio.equals(other.idMunicipio))
			return false;
		if (idProvaBrasil != other.idProvaBrasil)
			return false;
		if (idUf != other.idUf)
			return false;
		if (inPreenchimento != other.inPreenchimento)
			return false;
		if (txRespQ001 == null) {
			if (other.txRespQ001 != null)
				return false;
		} else if (!txRespQ001.equals(other.txRespQ001))
			return false;
		if (txRespQ002 == null) {
			if (other.txRespQ002 != null)
				return false;
		} else if (!txRespQ002.equals(other.txRespQ002))
			return false;
		if (txRespQ003 == null) {
			if (other.txRespQ003 != null)
				return false;
		} else if (!txRespQ003.equals(other.txRespQ003))
			return false;
		if (txRespQ004 == null) {
			if (other.txRespQ004 != null)
				return false;
		} else if (!txRespQ004.equals(other.txRespQ004))
			return false;
		if (txRespQ005 == null) {
			if (other.txRespQ005 != null)
				return false;
		} else if (!txRespQ005.equals(other.txRespQ005))
			return false;
		if (txRespQ006 == null) {
			if (other.txRespQ006 != null)
				return false;
		} else if (!txRespQ006.equals(other.txRespQ006))
			return false;
		if (txRespQ007 == null) {
			if (other.txRespQ007 != null)
				return false;
		} else if (!txRespQ007.equals(other.txRespQ007))
			return false;
		if (txRespQ008 == null) {
			if (other.txRespQ008 != null)
				return false;
		} else if (!txRespQ008.equals(other.txRespQ008))
			return false;
		if (txRespQ009 == null) {
			if (other.txRespQ009 != null)
				return false;
		} else if (!txRespQ009.equals(other.txRespQ009))
			return false;
		if (txRespQ010 == null) {
			if (other.txRespQ010 != null)
				return false;
		} else if (!txRespQ010.equals(other.txRespQ010))
			return false;
		if (txRespQ011 == null) {
			if (other.txRespQ011 != null)
				return false;
		} else if (!txRespQ011.equals(other.txRespQ011))
			return false;
		if (txRespQ012 == null) {
			if (other.txRespQ012 != null)
				return false;
		} else if (!txRespQ012.equals(other.txRespQ012))
			return false;
		if (txRespQ013 == null) {
			if (other.txRespQ013 != null)
				return false;
		} else if (!txRespQ013.equals(other.txRespQ013))
			return false;
		if (txRespQ014 == null) {
			if (other.txRespQ014 != null)
				return false;
		} else if (!txRespQ014.equals(other.txRespQ014))
			return false;
		if (txRespQ015 == null) {
			if (other.txRespQ015 != null)
				return false;
		} else if (!txRespQ015.equals(other.txRespQ015))
			return false;
		if (txRespQ016 == null) {
			if (other.txRespQ016 != null)
				return false;
		} else if (!txRespQ016.equals(other.txRespQ016))
			return false;
		if (txRespQ017 == null) {
			if (other.txRespQ017 != null)
				return false;
		} else if (!txRespQ017.equals(other.txRespQ017))
			return false;
		if (txRespQ018 == null) {
			if (other.txRespQ018 != null)
				return false;
		} else if (!txRespQ018.equals(other.txRespQ018))
			return false;
		if (txRespQ019 == null) {
			if (other.txRespQ019 != null)
				return false;
		} else if (!txRespQ019.equals(other.txRespQ019))
			return false;
		if (txRespQ020 == null) {
			if (other.txRespQ020 != null)
				return false;
		} else if (!txRespQ020.equals(other.txRespQ020))
			return false;
		if (txRespQ021 == null) {
			if (other.txRespQ021 != null)
				return false;
		} else if (!txRespQ021.equals(other.txRespQ021))
			return false;
		if (txRespQ022 == null) {
			if (other.txRespQ022 != null)
				return false;
		} else if (!txRespQ022.equals(other.txRespQ022))
			return false;
		if (txRespQ023 == null) {
			if (other.txRespQ023 != null)
				return false;
		} else if (!txRespQ023.equals(other.txRespQ023))
			return false;
		if (txRespQ024 == null) {
			if (other.txRespQ024 != null)
				return false;
		} else if (!txRespQ024.equals(other.txRespQ024))
			return false;
		if (txRespQ025 == null) {
			if (other.txRespQ025 != null)
				return false;
		} else if (!txRespQ025.equals(other.txRespQ025))
			return false;
		if (txRespQ026 == null) {
			if (other.txRespQ026 != null)
				return false;
		} else if (!txRespQ026.equals(other.txRespQ026))
			return false;
		if (txRespQ027 == null) {
			if (other.txRespQ027 != null)
				return false;
		} else if (!txRespQ027.equals(other.txRespQ027))
			return false;
		if (txRespQ028 == null) {
			if (other.txRespQ028 != null)
				return false;
		} else if (!txRespQ028.equals(other.txRespQ028))
			return false;
		if (txRespQ029 == null) {
			if (other.txRespQ029 != null)
				return false;
		} else if (!txRespQ029.equals(other.txRespQ029))
			return false;
		if (txRespQ030 == null) {
			if (other.txRespQ030 != null)
				return false;
		} else if (!txRespQ030.equals(other.txRespQ030))
			return false;
		if (txRespQ031 == null) {
			if (other.txRespQ031 != null)
				return false;
		} else if (!txRespQ031.equals(other.txRespQ031))
			return false;
		if (txRespQ032 == null) {
			if (other.txRespQ032 != null)
				return false;
		} else if (!txRespQ032.equals(other.txRespQ032))
			return false;
		if (txRespQ033 == null) {
			if (other.txRespQ033 != null)
				return false;
		} else if (!txRespQ033.equals(other.txRespQ033))
			return false;
		if (txRespQ034 == null) {
			if (other.txRespQ034 != null)
				return false;
		} else if (!txRespQ034.equals(other.txRespQ034))
			return false;
		if (txRespQ035 == null) {
			if (other.txRespQ035 != null)
				return false;
		} else if (!txRespQ035.equals(other.txRespQ035))
			return false;
		if (txRespQ036 == null) {
			if (other.txRespQ036 != null)
				return false;
		} else if (!txRespQ036.equals(other.txRespQ036))
			return false;
		if (txRespQ037 == null) {
			if (other.txRespQ037 != null)
				return false;
		} else if (!txRespQ037.equals(other.txRespQ037))
			return false;
		if (txRespQ038 == null) {
			if (other.txRespQ038 != null)
				return false;
		} else if (!txRespQ038.equals(other.txRespQ038))
			return false;
		if (txRespQ039 == null) {
			if (other.txRespQ039 != null)
				return false;
		} else if (!txRespQ039.equals(other.txRespQ039))
			return false;
		if (txRespQ040 == null) {
			if (other.txRespQ040 != null)
				return false;
		} else if (!txRespQ040.equals(other.txRespQ040))
			return false;
		if (txRespQ041 == null) {
			if (other.txRespQ041 != null)
				return false;
		} else if (!txRespQ041.equals(other.txRespQ041))
			return false;
		if (txRespQ042 == null) {
			if (other.txRespQ042 != null)
				return false;
		} else if (!txRespQ042.equals(other.txRespQ042))
			return false;
		if (txRespQ043 == null) {
			if (other.txRespQ043 != null)
				return false;
		} else if (!txRespQ043.equals(other.txRespQ043))
			return false;
		if (txRespQ044 == null) {
			if (other.txRespQ044 != null)
				return false;
		} else if (!txRespQ044.equals(other.txRespQ044))
			return false;
		if (txRespQ045 == null) {
			if (other.txRespQ045 != null)
				return false;
		} else if (!txRespQ045.equals(other.txRespQ045))
			return false;
		if (txRespQ046 == null) {
			if (other.txRespQ046 != null)
				return false;
		} else if (!txRespQ046.equals(other.txRespQ046))
			return false;
		if (txRespQ047 == null) {
			if (other.txRespQ047 != null)
				return false;
		} else if (!txRespQ047.equals(other.txRespQ047))
			return false;
		if (txRespQ048 == null) {
			if (other.txRespQ048 != null)
				return false;
		} else if (!txRespQ048.equals(other.txRespQ048))
			return false;
		if (txRespQ049 == null) {
			if (other.txRespQ049 != null)
				return false;
		} else if (!txRespQ049.equals(other.txRespQ049))
			return false;
		if (txRespQ050 == null) {
			if (other.txRespQ050 != null)
				return false;
		} else if (!txRespQ050.equals(other.txRespQ050))
			return false;
		if (txRespQ051 == null) {
			if (other.txRespQ051 != null)
				return false;
		} else if (!txRespQ051.equals(other.txRespQ051))
			return false;
		if (txRespQ052 == null) {
			if (other.txRespQ052 != null)
				return false;
		} else if (!txRespQ052.equals(other.txRespQ052))
			return false;
		if (txRespQ053 == null) {
			if (other.txRespQ053 != null)
				return false;
		} else if (!txRespQ053.equals(other.txRespQ053))
			return false;
		if (txRespQ054 == null) {
			if (other.txRespQ054 != null)
				return false;
		} else if (!txRespQ054.equals(other.txRespQ054))
			return false;
		if (txRespQ055 == null) {
			if (other.txRespQ055 != null)
				return false;
		} else if (!txRespQ055.equals(other.txRespQ055))
			return false;
		if (txRespQ056 == null) {
			if (other.txRespQ056 != null)
				return false;
		} else if (!txRespQ056.equals(other.txRespQ056))
			return false;
		if (txRespQ057 == null) {
			if (other.txRespQ057 != null)
				return false;
		} else if (!txRespQ057.equals(other.txRespQ057))
			return false;
		if (txRespQ058 == null) {
			if (other.txRespQ058 != null)
				return false;
		} else if (!txRespQ058.equals(other.txRespQ058))
			return false;
		if (txRespQ059 == null) {
			if (other.txRespQ059 != null)
				return false;
		} else if (!txRespQ059.equals(other.txRespQ059))
			return false;
		if (txRespQ060 == null) {
			if (other.txRespQ060 != null)
				return false;
		} else if (!txRespQ060.equals(other.txRespQ060))
			return false;
		if (txRespQ061 == null) {
			if (other.txRespQ061 != null)
				return false;
		} else if (!txRespQ061.equals(other.txRespQ061))
			return false;
		if (txRespQ062 == null) {
			if (other.txRespQ062 != null)
				return false;
		} else if (!txRespQ062.equals(other.txRespQ062))
			return false;
		if (txRespQ063 == null) {
			if (other.txRespQ063 != null)
				return false;
		} else if (!txRespQ063.equals(other.txRespQ063))
			return false;
		if (txRespQ064 == null) {
			if (other.txRespQ064 != null)
				return false;
		} else if (!txRespQ064.equals(other.txRespQ064))
			return false;
		if (txRespQ065 == null) {
			if (other.txRespQ065 != null)
				return false;
		} else if (!txRespQ065.equals(other.txRespQ065))
			return false;
		if (txRespQ066 == null) {
			if (other.txRespQ066 != null)
				return false;
		} else if (!txRespQ066.equals(other.txRespQ066))
			return false;
		return true;
	}
	
}