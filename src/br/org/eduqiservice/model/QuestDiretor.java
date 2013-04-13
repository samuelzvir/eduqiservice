package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the QUEST_DIRETOR database table.
 * 
 */
@Entity
@Table(name="QUEST_DIRETOR")
public class QuestDiretor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_DEPENDENCIA_ADM")
	private int idDependenciaAdm;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESCOLA")
	private BigInteger idEscola;

	@Column(name="ID_LOCALIZACAO")
	private int idLocalizacao;

	@Column(name="ID_MUNICIPIO")
	private BigInteger idMunicipio;

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

	@Column(name="TX_RESP_Q067")
	private String txRespQ067;

	@Column(name="TX_RESP_Q068")
	private String txRespQ068;

	@Column(name="TX_RESP_Q069")
	private String txRespQ069;

	@Column(name="TX_RESP_Q070")
	private String txRespQ070;

	@Column(name="TX_RESP_Q071")
	private String txRespQ071;

	@Column(name="TX_RESP_Q072")
	private String txRespQ072;

	@Column(name="TX_RESP_Q073")
	private String txRespQ073;

	@Column(name="TX_RESP_Q074")
	private String txRespQ074;

	@Column(name="TX_RESP_Q075")
	private String txRespQ075;

	@Column(name="TX_RESP_Q076")
	private String txRespQ076;

	@Column(name="TX_RESP_Q077")
	private String txRespQ077;

	@Column(name="TX_RESP_Q078")
	private String txRespQ078;

	@Column(name="TX_RESP_Q079")
	private String txRespQ079;

	@Column(name="TX_RESP_Q080")
	private String txRespQ080;

	@Column(name="TX_RESP_Q081")
	private String txRespQ081;

	@Column(name="TX_RESP_Q082")
	private String txRespQ082;

	@Column(name="TX_RESP_Q083")
	private String txRespQ083;

	@Column(name="TX_RESP_Q084")
	private String txRespQ084;

	@Column(name="TX_RESP_Q085")
	private String txRespQ085;

	@Column(name="TX_RESP_Q086")
	private String txRespQ086;

	@Column(name="TX_RESP_Q087")
	private String txRespQ087;

	@Column(name="TX_RESP_Q088")
	private String txRespQ088;

	@Column(name="TX_RESP_Q089")
	private String txRespQ089;

	@Column(name="TX_RESP_Q090")
	private String txRespQ090;

	@Column(name="TX_RESP_Q091")
	private String txRespQ091;

	@Column(name="TX_RESP_Q092")
	private String txRespQ092;

	@Column(name="TX_RESP_Q093")
	private String txRespQ093;

	@Column(name="TX_RESP_Q094")
	private String txRespQ094;

	@Column(name="TX_RESP_Q095")
	private String txRespQ095;

	@Column(name="TX_RESP_Q096")
	private String txRespQ096;

	@Column(name="TX_RESP_Q097")
	private String txRespQ097;

	@Column(name="TX_RESP_Q098")
	private String txRespQ098;

	@Column(name="TX_RESP_Q099")
	private String txRespQ099;

	@Column(name="TX_RESP_Q100")
	private String txRespQ100;

	@Column(name="TX_RESP_Q101")
	private String txRespQ101;

	@Column(name="TX_RESP_Q102")
	private String txRespQ102;

	@Column(name="TX_RESP_Q103")
	private String txRespQ103;

	@Column(name="TX_RESP_Q104")
	private String txRespQ104;

	@Column(name="TX_RESP_Q105")
	private String txRespQ105;

	@Column(name="TX_RESP_Q106")
	private String txRespQ106;

	@Column(name="TX_RESP_Q107")
	private String txRespQ107;

	@Column(name="TX_RESP_Q108")
	private String txRespQ108;

	@Column(name="TX_RESP_Q109")
	private String txRespQ109;

	@Column(name="TX_RESP_Q110")
	private String txRespQ110;

	@Column(name="TX_RESP_Q111")
	private String txRespQ111;

	@Column(name="TX_RESP_Q112")
	private String txRespQ112;

	@Column(name="TX_RESP_Q113")
	private String txRespQ113;

	@Column(name="TX_RESP_Q114")
	private String txRespQ114;

	@Column(name="TX_RESP_Q115")
	private String txRespQ115;

	@Column(name="TX_RESP_Q116")
	private String txRespQ116;

	@Column(name="TX_RESP_Q117")
	private String txRespQ117;

	@Column(name="TX_RESP_Q118")
	private String txRespQ118;

	@Column(name="TX_RESP_Q119")
	private String txRespQ119;

	@Column(name="TX_RESP_Q120")
	private String txRespQ120;

	@Column(name="TX_RESP_Q121")
	private String txRespQ121;

	@Column(name="TX_RESP_Q122")
	private String txRespQ122;

	@Column(name="TX_RESP_Q123")
	private String txRespQ123;

	@Column(name="TX_RESP_Q124")
	private String txRespQ124;

	@Column(name="TX_RESP_Q125")
	private String txRespQ125;

	@Column(name="TX_RESP_Q126")
	private String txRespQ126;

	@Column(name="TX_RESP_Q127")
	private String txRespQ127;

	@Column(name="TX_RESP_Q128")
	private String txRespQ128;

	@Column(name="TX_RESP_Q129")
	private String txRespQ129;

	@Column(name="TX_RESP_Q130")
	private String txRespQ130;

	@Column(name="TX_RESP_Q131")
	private String txRespQ131;

	@Column(name="TX_RESP_Q132")
	private String txRespQ132;

	@Column(name="TX_RESP_Q133")
	private String txRespQ133;

	@Column(name="TX_RESP_Q134")
	private String txRespQ134;

	@Column(name="TX_RESP_Q135")
	private String txRespQ135;

	@Column(name="TX_RESP_Q136")
	private String txRespQ136;

	@Column(name="TX_RESP_Q137")
	private String txRespQ137;

	@Column(name="TX_RESP_Q138")
	private String txRespQ138;

	@Column(name="TX_RESP_Q139")
	private String txRespQ139;

	@Column(name="TX_RESP_Q140")
	private String txRespQ140;

	@Column(name="TX_RESP_Q141")
	private String txRespQ141;

	@Column(name="TX_RESP_Q142")
	private String txRespQ142;

	@Column(name="TX_RESP_Q143")
	private String txRespQ143;

	@Column(name="TX_RESP_Q144")
	private String txRespQ144;

	@Column(name="TX_RESP_Q145")
	private String txRespQ145;

	@Column(name="TX_RESP_Q146")
	private String txRespQ146;

	@Column(name="TX_RESP_Q147")
	private String txRespQ147;

	@Column(name="TX_RESP_Q148")
	private String txRespQ148;

	@Column(name="TX_RESP_Q149")
	private String txRespQ149;

	@Column(name="TX_RESP_Q150")
	private String txRespQ150;

	@Column(name="TX_RESP_Q151")
	private String txRespQ151;

	@Column(name="TX_RESP_Q152")
	private String txRespQ152;

	@Column(name="TX_RESP_Q153")
	private String txRespQ153;

	@Column(name="TX_RESP_Q154")
	private String txRespQ154;

	@Column(name="TX_RESP_Q155")
	private String txRespQ155;

	@Column(name="TX_RESP_Q156")
	private String txRespQ156;

	@Column(name="TX_RESP_Q157")
	private String txRespQ157;

	@Column(name="TX_RESP_Q158")
	private String txRespQ158;

	@Column(name="TX_RESP_Q159")
	private String txRespQ159;

	@Column(name="TX_RESP_Q160")
	private String txRespQ160;

	@Column(name="TX_RESP_Q161")
	private String txRespQ161;

	@Column(name="TX_RESP_Q162")
	private String txRespQ162;

	@Column(name="TX_RESP_Q163")
	private String txRespQ163;

	@Column(name="TX_RESP_Q164")
	private String txRespQ164;

	@Column(name="TX_RESP_Q165")
	private String txRespQ165;

	@Column(name="TX_RESP_Q166")
	private String txRespQ166;

	@Column(name="TX_RESP_Q167")
	private String txRespQ167;

	@Column(name="TX_RESP_Q168")
	private String txRespQ168;

	@Column(name="TX_RESP_Q169")
	private String txRespQ169;

	@Column(name="TX_RESP_Q170")
	private String txRespQ170;

	@Column(name="TX_RESP_Q171")
	private String txRespQ171;

	@Column(name="TX_RESP_Q172")
	private String txRespQ172;

	@Column(name="TX_RESP_Q173")
	private String txRespQ173;

	@Column(name="TX_RESP_Q174")
	private String txRespQ174;

	@Column(name="TX_RESP_Q175")
	private String txRespQ175;

	@Column(name="TX_RESP_Q176")
	private String txRespQ176;

	@Column(name="TX_RESP_Q177")
	private String txRespQ177;

	@Column(name="TX_RESP_Q178")
	private String txRespQ178;

	@Column(name="TX_RESP_Q179")
	private String txRespQ179;

	@Column(name="TX_RESP_Q180")
	private String txRespQ180;

	@Column(name="TX_RESP_Q181")
	private String txRespQ181;

	@Column(name="TX_RESP_Q182")
	private String txRespQ182;

	@Column(name="TX_RESP_Q183")
	private String txRespQ183;

	@Column(name="TX_RESP_Q184")
	private String txRespQ184;

	@Column(name="TX_RESP_Q185")
	private String txRespQ185;

	@Column(name="TX_RESP_Q186")
	private String txRespQ186;

	@Column(name="TX_RESP_Q187")
	private String txRespQ187;

	@Column(name="TX_RESP_Q188")
	private String txRespQ188;

	@Column(name="TX_RESP_Q189")
	private String txRespQ189;

	@Column(name="TX_RESP_Q190")
	private String txRespQ190;

	@Column(name="TX_RESP_Q191")
	private String txRespQ191;

	@Column(name="TX_RESP_Q192")
	private String txRespQ192;

	@Column(name="TX_RESP_Q193")
	private String txRespQ193;

	@Column(name="TX_RESP_Q194")
	private String txRespQ194;

	@Column(name="TX_RESP_Q195")
	private String txRespQ195;

	@Column(name="TX_RESP_Q196")
	private String txRespQ196;

	@Column(name="TX_RESP_Q197")
	private String txRespQ197;

	@Column(name="TX_RESP_Q198")
	private String txRespQ198;

	@Column(name="TX_RESP_Q199")
	private String txRespQ199;

	@Column(name="TX_RESP_Q200")
	private String txRespQ200;

	@Column(name="TX_RESP_Q201")
	private String txRespQ201;

	@Column(name="TX_RESP_Q202")
	private String txRespQ202;

	@Column(name="TX_RESP_Q203")
	private String txRespQ203;

	@Column(name="TX_RESP_Q204")
	private String txRespQ204;

	@Column(name="TX_RESP_Q205")
	private String txRespQ205;

	@Column(name="TX_RESP_Q206")
	private String txRespQ206;

	@Column(name="TX_RESP_Q207")
	private String txRespQ207;

	@Column(name="TX_RESP_Q208")
	private String txRespQ208;

	@Column(name="TX_RESP_Q209")
	private String txRespQ209;

	@Column(name="TX_RESP_Q210")
	private String txRespQ210;

	@Column(name="TX_RESP_Q211")
	private String txRespQ211;

	@Column(name="TX_RESP_Q212")
	private String txRespQ212;

	public QuestDiretor() {
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

	public String getTxRespQ067() {
		return this.txRespQ067;
	}

	public void setTxRespQ067(String txRespQ067) {
		this.txRespQ067 = txRespQ067;
	}

	public String getTxRespQ068() {
		return this.txRespQ068;
	}

	public void setTxRespQ068(String txRespQ068) {
		this.txRespQ068 = txRespQ068;
	}

	public String getTxRespQ069() {
		return this.txRespQ069;
	}

	public void setTxRespQ069(String txRespQ069) {
		this.txRespQ069 = txRespQ069;
	}

	public String getTxRespQ070() {
		return this.txRespQ070;
	}

	public void setTxRespQ070(String txRespQ070) {
		this.txRespQ070 = txRespQ070;
	}

	public String getTxRespQ071() {
		return this.txRespQ071;
	}

	public void setTxRespQ071(String txRespQ071) {
		this.txRespQ071 = txRespQ071;
	}

	public String getTxRespQ072() {
		return this.txRespQ072;
	}

	public void setTxRespQ072(String txRespQ072) {
		this.txRespQ072 = txRespQ072;
	}

	public String getTxRespQ073() {
		return this.txRespQ073;
	}

	public void setTxRespQ073(String txRespQ073) {
		this.txRespQ073 = txRespQ073;
	}

	public String getTxRespQ074() {
		return this.txRespQ074;
	}

	public void setTxRespQ074(String txRespQ074) {
		this.txRespQ074 = txRespQ074;
	}

	public String getTxRespQ075() {
		return this.txRespQ075;
	}

	public void setTxRespQ075(String txRespQ075) {
		this.txRespQ075 = txRespQ075;
	}

	public String getTxRespQ076() {
		return this.txRespQ076;
	}

	public void setTxRespQ076(String txRespQ076) {
		this.txRespQ076 = txRespQ076;
	}

	public String getTxRespQ077() {
		return this.txRespQ077;
	}

	public void setTxRespQ077(String txRespQ077) {
		this.txRespQ077 = txRespQ077;
	}

	public String getTxRespQ078() {
		return this.txRespQ078;
	}

	public void setTxRespQ078(String txRespQ078) {
		this.txRespQ078 = txRespQ078;
	}

	public String getTxRespQ079() {
		return this.txRespQ079;
	}

	public void setTxRespQ079(String txRespQ079) {
		this.txRespQ079 = txRespQ079;
	}

	public String getTxRespQ080() {
		return this.txRespQ080;
	}

	public void setTxRespQ080(String txRespQ080) {
		this.txRespQ080 = txRespQ080;
	}

	public String getTxRespQ081() {
		return this.txRespQ081;
	}

	public void setTxRespQ081(String txRespQ081) {
		this.txRespQ081 = txRespQ081;
	}

	public String getTxRespQ082() {
		return this.txRespQ082;
	}

	public void setTxRespQ082(String txRespQ082) {
		this.txRespQ082 = txRespQ082;
	}

	public String getTxRespQ083() {
		return this.txRespQ083;
	}

	public void setTxRespQ083(String txRespQ083) {
		this.txRespQ083 = txRespQ083;
	}

	public String getTxRespQ084() {
		return this.txRespQ084;
	}

	public void setTxRespQ084(String txRespQ084) {
		this.txRespQ084 = txRespQ084;
	}

	public String getTxRespQ085() {
		return this.txRespQ085;
	}

	public void setTxRespQ085(String txRespQ085) {
		this.txRespQ085 = txRespQ085;
	}

	public String getTxRespQ086() {
		return this.txRespQ086;
	}

	public void setTxRespQ086(String txRespQ086) {
		this.txRespQ086 = txRespQ086;
	}

	public String getTxRespQ087() {
		return this.txRespQ087;
	}

	public void setTxRespQ087(String txRespQ087) {
		this.txRespQ087 = txRespQ087;
	}

	public String getTxRespQ088() {
		return this.txRespQ088;
	}

	public void setTxRespQ088(String txRespQ088) {
		this.txRespQ088 = txRespQ088;
	}

	public String getTxRespQ089() {
		return this.txRespQ089;
	}

	public void setTxRespQ089(String txRespQ089) {
		this.txRespQ089 = txRespQ089;
	}

	public String getTxRespQ090() {
		return this.txRespQ090;
	}

	public void setTxRespQ090(String txRespQ090) {
		this.txRespQ090 = txRespQ090;
	}

	public String getTxRespQ091() {
		return this.txRespQ091;
	}

	public void setTxRespQ091(String txRespQ091) {
		this.txRespQ091 = txRespQ091;
	}

	public String getTxRespQ092() {
		return this.txRespQ092;
	}

	public void setTxRespQ092(String txRespQ092) {
		this.txRespQ092 = txRespQ092;
	}

	public String getTxRespQ093() {
		return this.txRespQ093;
	}

	public void setTxRespQ093(String txRespQ093) {
		this.txRespQ093 = txRespQ093;
	}

	public String getTxRespQ094() {
		return this.txRespQ094;
	}

	public void setTxRespQ094(String txRespQ094) {
		this.txRespQ094 = txRespQ094;
	}

	public String getTxRespQ095() {
		return this.txRespQ095;
	}

	public void setTxRespQ095(String txRespQ095) {
		this.txRespQ095 = txRespQ095;
	}

	public String getTxRespQ096() {
		return this.txRespQ096;
	}

	public void setTxRespQ096(String txRespQ096) {
		this.txRespQ096 = txRespQ096;
	}

	public String getTxRespQ097() {
		return this.txRespQ097;
	}

	public void setTxRespQ097(String txRespQ097) {
		this.txRespQ097 = txRespQ097;
	}

	public String getTxRespQ098() {
		return this.txRespQ098;
	}

	public void setTxRespQ098(String txRespQ098) {
		this.txRespQ098 = txRespQ098;
	}

	public String getTxRespQ099() {
		return this.txRespQ099;
	}

	public void setTxRespQ099(String txRespQ099) {
		this.txRespQ099 = txRespQ099;
	}

	public String getTxRespQ100() {
		return this.txRespQ100;
	}

	public void setTxRespQ100(String txRespQ100) {
		this.txRespQ100 = txRespQ100;
	}

	public String getTxRespQ101() {
		return this.txRespQ101;
	}

	public void setTxRespQ101(String txRespQ101) {
		this.txRespQ101 = txRespQ101;
	}

	public String getTxRespQ102() {
		return this.txRespQ102;
	}

	public void setTxRespQ102(String txRespQ102) {
		this.txRespQ102 = txRespQ102;
	}

	public String getTxRespQ103() {
		return this.txRespQ103;
	}

	public void setTxRespQ103(String txRespQ103) {
		this.txRespQ103 = txRespQ103;
	}

	public String getTxRespQ104() {
		return this.txRespQ104;
	}

	public void setTxRespQ104(String txRespQ104) {
		this.txRespQ104 = txRespQ104;
	}

	public String getTxRespQ105() {
		return this.txRespQ105;
	}

	public void setTxRespQ105(String txRespQ105) {
		this.txRespQ105 = txRespQ105;
	}

	public String getTxRespQ106() {
		return this.txRespQ106;
	}

	public void setTxRespQ106(String txRespQ106) {
		this.txRespQ106 = txRespQ106;
	}

	public String getTxRespQ107() {
		return this.txRespQ107;
	}

	public void setTxRespQ107(String txRespQ107) {
		this.txRespQ107 = txRespQ107;
	}

	public String getTxRespQ108() {
		return this.txRespQ108;
	}

	public void setTxRespQ108(String txRespQ108) {
		this.txRespQ108 = txRespQ108;
	}

	public String getTxRespQ109() {
		return this.txRespQ109;
	}

	public void setTxRespQ109(String txRespQ109) {
		this.txRespQ109 = txRespQ109;
	}

	public String getTxRespQ110() {
		return this.txRespQ110;
	}

	public void setTxRespQ110(String txRespQ110) {
		this.txRespQ110 = txRespQ110;
	}

	public String getTxRespQ111() {
		return this.txRespQ111;
	}

	public void setTxRespQ111(String txRespQ111) {
		this.txRespQ111 = txRespQ111;
	}

	public String getTxRespQ112() {
		return this.txRespQ112;
	}

	public void setTxRespQ112(String txRespQ112) {
		this.txRespQ112 = txRespQ112;
	}

	public String getTxRespQ113() {
		return this.txRespQ113;
	}

	public void setTxRespQ113(String txRespQ113) {
		this.txRespQ113 = txRespQ113;
	}

	public String getTxRespQ114() {
		return this.txRespQ114;
	}

	public void setTxRespQ114(String txRespQ114) {
		this.txRespQ114 = txRespQ114;
	}

	public String getTxRespQ115() {
		return this.txRespQ115;
	}

	public void setTxRespQ115(String txRespQ115) {
		this.txRespQ115 = txRespQ115;
	}

	public String getTxRespQ116() {
		return this.txRespQ116;
	}

	public void setTxRespQ116(String txRespQ116) {
		this.txRespQ116 = txRespQ116;
	}

	public String getTxRespQ117() {
		return this.txRespQ117;
	}

	public void setTxRespQ117(String txRespQ117) {
		this.txRespQ117 = txRespQ117;
	}

	public String getTxRespQ118() {
		return this.txRespQ118;
	}

	public void setTxRespQ118(String txRespQ118) {
		this.txRespQ118 = txRespQ118;
	}

	public String getTxRespQ119() {
		return this.txRespQ119;
	}

	public void setTxRespQ119(String txRespQ119) {
		this.txRespQ119 = txRespQ119;
	}

	public String getTxRespQ120() {
		return this.txRespQ120;
	}

	public void setTxRespQ120(String txRespQ120) {
		this.txRespQ120 = txRespQ120;
	}

	public String getTxRespQ121() {
		return this.txRespQ121;
	}

	public void setTxRespQ121(String txRespQ121) {
		this.txRespQ121 = txRespQ121;
	}

	public String getTxRespQ122() {
		return this.txRespQ122;
	}

	public void setTxRespQ122(String txRespQ122) {
		this.txRespQ122 = txRespQ122;
	}

	public String getTxRespQ123() {
		return this.txRespQ123;
	}

	public void setTxRespQ123(String txRespQ123) {
		this.txRespQ123 = txRespQ123;
	}

	public String getTxRespQ124() {
		return this.txRespQ124;
	}

	public void setTxRespQ124(String txRespQ124) {
		this.txRespQ124 = txRespQ124;
	}

	public String getTxRespQ125() {
		return this.txRespQ125;
	}

	public void setTxRespQ125(String txRespQ125) {
		this.txRespQ125 = txRespQ125;
	}

	public String getTxRespQ126() {
		return this.txRespQ126;
	}

	public void setTxRespQ126(String txRespQ126) {
		this.txRespQ126 = txRespQ126;
	}

	public String getTxRespQ127() {
		return this.txRespQ127;
	}

	public void setTxRespQ127(String txRespQ127) {
		this.txRespQ127 = txRespQ127;
	}

	public String getTxRespQ128() {
		return this.txRespQ128;
	}

	public void setTxRespQ128(String txRespQ128) {
		this.txRespQ128 = txRespQ128;
	}

	public String getTxRespQ129() {
		return this.txRespQ129;
	}

	public void setTxRespQ129(String txRespQ129) {
		this.txRespQ129 = txRespQ129;
	}

	public String getTxRespQ130() {
		return this.txRespQ130;
	}

	public void setTxRespQ130(String txRespQ130) {
		this.txRespQ130 = txRespQ130;
	}

	public String getTxRespQ131() {
		return this.txRespQ131;
	}

	public void setTxRespQ131(String txRespQ131) {
		this.txRespQ131 = txRespQ131;
	}

	public String getTxRespQ132() {
		return this.txRespQ132;
	}

	public void setTxRespQ132(String txRespQ132) {
		this.txRespQ132 = txRespQ132;
	}

	public String getTxRespQ133() {
		return this.txRespQ133;
	}

	public void setTxRespQ133(String txRespQ133) {
		this.txRespQ133 = txRespQ133;
	}

	public String getTxRespQ134() {
		return this.txRespQ134;
	}

	public void setTxRespQ134(String txRespQ134) {
		this.txRespQ134 = txRespQ134;
	}

	public String getTxRespQ135() {
		return this.txRespQ135;
	}

	public void setTxRespQ135(String txRespQ135) {
		this.txRespQ135 = txRespQ135;
	}

	public String getTxRespQ136() {
		return this.txRespQ136;
	}

	public void setTxRespQ136(String txRespQ136) {
		this.txRespQ136 = txRespQ136;
	}

	public String getTxRespQ137() {
		return this.txRespQ137;
	}

	public void setTxRespQ137(String txRespQ137) {
		this.txRespQ137 = txRespQ137;
	}

	public String getTxRespQ138() {
		return this.txRespQ138;
	}

	public void setTxRespQ138(String txRespQ138) {
		this.txRespQ138 = txRespQ138;
	}

	public String getTxRespQ139() {
		return this.txRespQ139;
	}

	public void setTxRespQ139(String txRespQ139) {
		this.txRespQ139 = txRespQ139;
	}

	public String getTxRespQ140() {
		return this.txRespQ140;
	}

	public void setTxRespQ140(String txRespQ140) {
		this.txRespQ140 = txRespQ140;
	}

	public String getTxRespQ141() {
		return this.txRespQ141;
	}

	public void setTxRespQ141(String txRespQ141) {
		this.txRespQ141 = txRespQ141;
	}

	public String getTxRespQ142() {
		return this.txRespQ142;
	}

	public void setTxRespQ142(String txRespQ142) {
		this.txRespQ142 = txRespQ142;
	}

	public String getTxRespQ143() {
		return this.txRespQ143;
	}

	public void setTxRespQ143(String txRespQ143) {
		this.txRespQ143 = txRespQ143;
	}

	public String getTxRespQ144() {
		return this.txRespQ144;
	}

	public void setTxRespQ144(String txRespQ144) {
		this.txRespQ144 = txRespQ144;
	}

	public String getTxRespQ145() {
		return this.txRespQ145;
	}

	public void setTxRespQ145(String txRespQ145) {
		this.txRespQ145 = txRespQ145;
	}

	public String getTxRespQ146() {
		return this.txRespQ146;
	}

	public void setTxRespQ146(String txRespQ146) {
		this.txRespQ146 = txRespQ146;
	}

	public String getTxRespQ147() {
		return this.txRespQ147;
	}

	public void setTxRespQ147(String txRespQ147) {
		this.txRespQ147 = txRespQ147;
	}

	public String getTxRespQ148() {
		return this.txRespQ148;
	}

	public void setTxRespQ148(String txRespQ148) {
		this.txRespQ148 = txRespQ148;
	}

	public String getTxRespQ149() {
		return this.txRespQ149;
	}

	public void setTxRespQ149(String txRespQ149) {
		this.txRespQ149 = txRespQ149;
	}

	public String getTxRespQ150() {
		return this.txRespQ150;
	}

	public void setTxRespQ150(String txRespQ150) {
		this.txRespQ150 = txRespQ150;
	}

	public String getTxRespQ151() {
		return this.txRespQ151;
	}

	public void setTxRespQ151(String txRespQ151) {
		this.txRespQ151 = txRespQ151;
	}

	public String getTxRespQ152() {
		return this.txRespQ152;
	}

	public void setTxRespQ152(String txRespQ152) {
		this.txRespQ152 = txRespQ152;
	}

	public String getTxRespQ153() {
		return this.txRespQ153;
	}

	public void setTxRespQ153(String txRespQ153) {
		this.txRespQ153 = txRespQ153;
	}

	public String getTxRespQ154() {
		return this.txRespQ154;
	}

	public void setTxRespQ154(String txRespQ154) {
		this.txRespQ154 = txRespQ154;
	}

	public String getTxRespQ155() {
		return this.txRespQ155;
	}

	public void setTxRespQ155(String txRespQ155) {
		this.txRespQ155 = txRespQ155;
	}

	public String getTxRespQ156() {
		return this.txRespQ156;
	}

	public void setTxRespQ156(String txRespQ156) {
		this.txRespQ156 = txRespQ156;
	}

	public String getTxRespQ157() {
		return this.txRespQ157;
	}

	public void setTxRespQ157(String txRespQ157) {
		this.txRespQ157 = txRespQ157;
	}

	public String getTxRespQ158() {
		return this.txRespQ158;
	}

	public void setTxRespQ158(String txRespQ158) {
		this.txRespQ158 = txRespQ158;
	}

	public String getTxRespQ159() {
		return this.txRespQ159;
	}

	public void setTxRespQ159(String txRespQ159) {
		this.txRespQ159 = txRespQ159;
	}

	public String getTxRespQ160() {
		return this.txRespQ160;
	}

	public void setTxRespQ160(String txRespQ160) {
		this.txRespQ160 = txRespQ160;
	}

	public String getTxRespQ161() {
		return this.txRespQ161;
	}

	public void setTxRespQ161(String txRespQ161) {
		this.txRespQ161 = txRespQ161;
	}

	public String getTxRespQ162() {
		return this.txRespQ162;
	}

	public void setTxRespQ162(String txRespQ162) {
		this.txRespQ162 = txRespQ162;
	}

	public String getTxRespQ163() {
		return this.txRespQ163;
	}

	public void setTxRespQ163(String txRespQ163) {
		this.txRespQ163 = txRespQ163;
	}

	public String getTxRespQ164() {
		return this.txRespQ164;
	}

	public void setTxRespQ164(String txRespQ164) {
		this.txRespQ164 = txRespQ164;
	}

	public String getTxRespQ165() {
		return this.txRespQ165;
	}

	public void setTxRespQ165(String txRespQ165) {
		this.txRespQ165 = txRespQ165;
	}

	public String getTxRespQ166() {
		return this.txRespQ166;
	}

	public void setTxRespQ166(String txRespQ166) {
		this.txRespQ166 = txRespQ166;
	}

	public String getTxRespQ167() {
		return this.txRespQ167;
	}

	public void setTxRespQ167(String txRespQ167) {
		this.txRespQ167 = txRespQ167;
	}

	public String getTxRespQ168() {
		return this.txRespQ168;
	}

	public void setTxRespQ168(String txRespQ168) {
		this.txRespQ168 = txRespQ168;
	}

	public String getTxRespQ169() {
		return this.txRespQ169;
	}

	public void setTxRespQ169(String txRespQ169) {
		this.txRespQ169 = txRespQ169;
	}

	public String getTxRespQ170() {
		return this.txRespQ170;
	}

	public void setTxRespQ170(String txRespQ170) {
		this.txRespQ170 = txRespQ170;
	}

	public String getTxRespQ171() {
		return this.txRespQ171;
	}

	public void setTxRespQ171(String txRespQ171) {
		this.txRespQ171 = txRespQ171;
	}

	public String getTxRespQ172() {
		return this.txRespQ172;
	}

	public void setTxRespQ172(String txRespQ172) {
		this.txRespQ172 = txRespQ172;
	}

	public String getTxRespQ173() {
		return this.txRespQ173;
	}

	public void setTxRespQ173(String txRespQ173) {
		this.txRespQ173 = txRespQ173;
	}

	public String getTxRespQ174() {
		return this.txRespQ174;
	}

	public void setTxRespQ174(String txRespQ174) {
		this.txRespQ174 = txRespQ174;
	}

	public String getTxRespQ175() {
		return this.txRespQ175;
	}

	public void setTxRespQ175(String txRespQ175) {
		this.txRespQ175 = txRespQ175;
	}

	public String getTxRespQ176() {
		return this.txRespQ176;
	}

	public void setTxRespQ176(String txRespQ176) {
		this.txRespQ176 = txRespQ176;
	}

	public String getTxRespQ177() {
		return this.txRespQ177;
	}

	public void setTxRespQ177(String txRespQ177) {
		this.txRespQ177 = txRespQ177;
	}

	public String getTxRespQ178() {
		return this.txRespQ178;
	}

	public void setTxRespQ178(String txRespQ178) {
		this.txRespQ178 = txRespQ178;
	}

	public String getTxRespQ179() {
		return this.txRespQ179;
	}

	public void setTxRespQ179(String txRespQ179) {
		this.txRespQ179 = txRespQ179;
	}

	public String getTxRespQ180() {
		return this.txRespQ180;
	}

	public void setTxRespQ180(String txRespQ180) {
		this.txRespQ180 = txRespQ180;
	}

	public String getTxRespQ181() {
		return this.txRespQ181;
	}

	public void setTxRespQ181(String txRespQ181) {
		this.txRespQ181 = txRespQ181;
	}

	public String getTxRespQ182() {
		return this.txRespQ182;
	}

	public void setTxRespQ182(String txRespQ182) {
		this.txRespQ182 = txRespQ182;
	}

	public String getTxRespQ183() {
		return this.txRespQ183;
	}

	public void setTxRespQ183(String txRespQ183) {
		this.txRespQ183 = txRespQ183;
	}

	public String getTxRespQ184() {
		return this.txRespQ184;
	}

	public void setTxRespQ184(String txRespQ184) {
		this.txRespQ184 = txRespQ184;
	}

	public String getTxRespQ185() {
		return this.txRespQ185;
	}

	public void setTxRespQ185(String txRespQ185) {
		this.txRespQ185 = txRespQ185;
	}

	public String getTxRespQ186() {
		return this.txRespQ186;
	}

	public void setTxRespQ186(String txRespQ186) {
		this.txRespQ186 = txRespQ186;
	}

	public String getTxRespQ187() {
		return this.txRespQ187;
	}

	public void setTxRespQ187(String txRespQ187) {
		this.txRespQ187 = txRespQ187;
	}

	public String getTxRespQ188() {
		return this.txRespQ188;
	}

	public void setTxRespQ188(String txRespQ188) {
		this.txRespQ188 = txRespQ188;
	}

	public String getTxRespQ189() {
		return this.txRespQ189;
	}

	public void setTxRespQ189(String txRespQ189) {
		this.txRespQ189 = txRespQ189;
	}

	public String getTxRespQ190() {
		return this.txRespQ190;
	}

	public void setTxRespQ190(String txRespQ190) {
		this.txRespQ190 = txRespQ190;
	}

	public String getTxRespQ191() {
		return this.txRespQ191;
	}

	public void setTxRespQ191(String txRespQ191) {
		this.txRespQ191 = txRespQ191;
	}

	public String getTxRespQ192() {
		return this.txRespQ192;
	}

	public void setTxRespQ192(String txRespQ192) {
		this.txRespQ192 = txRespQ192;
	}

	public String getTxRespQ193() {
		return this.txRespQ193;
	}

	public void setTxRespQ193(String txRespQ193) {
		this.txRespQ193 = txRespQ193;
	}

	public String getTxRespQ194() {
		return this.txRespQ194;
	}

	public void setTxRespQ194(String txRespQ194) {
		this.txRespQ194 = txRespQ194;
	}

	public String getTxRespQ195() {
		return this.txRespQ195;
	}

	public void setTxRespQ195(String txRespQ195) {
		this.txRespQ195 = txRespQ195;
	}

	public String getTxRespQ196() {
		return this.txRespQ196;
	}

	public void setTxRespQ196(String txRespQ196) {
		this.txRespQ196 = txRespQ196;
	}

	public String getTxRespQ197() {
		return this.txRespQ197;
	}

	public void setTxRespQ197(String txRespQ197) {
		this.txRespQ197 = txRespQ197;
	}

	public String getTxRespQ198() {
		return this.txRespQ198;
	}

	public void setTxRespQ198(String txRespQ198) {
		this.txRespQ198 = txRespQ198;
	}

	public String getTxRespQ199() {
		return this.txRespQ199;
	}

	public void setTxRespQ199(String txRespQ199) {
		this.txRespQ199 = txRespQ199;
	}

	public String getTxRespQ200() {
		return this.txRespQ200;
	}

	public void setTxRespQ200(String txRespQ200) {
		this.txRespQ200 = txRespQ200;
	}

	public String getTxRespQ201() {
		return this.txRespQ201;
	}

	public void setTxRespQ201(String txRespQ201) {
		this.txRespQ201 = txRespQ201;
	}

	public String getTxRespQ202() {
		return this.txRespQ202;
	}

	public void setTxRespQ202(String txRespQ202) {
		this.txRespQ202 = txRespQ202;
	}

	public String getTxRespQ203() {
		return this.txRespQ203;
	}

	public void setTxRespQ203(String txRespQ203) {
		this.txRespQ203 = txRespQ203;
	}

	public String getTxRespQ204() {
		return this.txRespQ204;
	}

	public void setTxRespQ204(String txRespQ204) {
		this.txRespQ204 = txRespQ204;
	}

	public String getTxRespQ205() {
		return this.txRespQ205;
	}

	public void setTxRespQ205(String txRespQ205) {
		this.txRespQ205 = txRespQ205;
	}

	public String getTxRespQ206() {
		return this.txRespQ206;
	}

	public void setTxRespQ206(String txRespQ206) {
		this.txRespQ206 = txRespQ206;
	}

	public String getTxRespQ207() {
		return this.txRespQ207;
	}

	public void setTxRespQ207(String txRespQ207) {
		this.txRespQ207 = txRespQ207;
	}

	public String getTxRespQ208() {
		return this.txRespQ208;
	}

	public void setTxRespQ208(String txRespQ208) {
		this.txRespQ208 = txRespQ208;
	}

	public String getTxRespQ209() {
		return this.txRespQ209;
	}

	public void setTxRespQ209(String txRespQ209) {
		this.txRespQ209 = txRespQ209;
	}

	public String getTxRespQ210() {
		return this.txRespQ210;
	}

	public void setTxRespQ210(String txRespQ210) {
		this.txRespQ210 = txRespQ210;
	}

	public String getTxRespQ211() {
		return this.txRespQ211;
	}

	public void setTxRespQ211(String txRespQ211) {
		this.txRespQ211 = txRespQ211;
	}

	public String getTxRespQ212() {
		return this.txRespQ212;
	}

	public void setTxRespQ212(String txRespQ212) {
		this.txRespQ212 = txRespQ212;
	}

}