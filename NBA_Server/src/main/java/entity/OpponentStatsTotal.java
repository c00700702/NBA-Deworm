package entity;

/**
 * 球队对手总数据
 * 
 * created by JaneLDQ on 2015年5月17日 下午2:28:13
 */
public class OpponentStatsTotal {

	/**
	 * 球队
	 */
	private String abbr;
	
	/**
	 * 赛季
	 */
	private String season;
	
	/**
	 * 比赛场数
	 */
	private Integer num_of_game;
	
	/**
	 * 在场时间
	 */
	private Integer minute;
	
	/**
	 * 投篮命中数
	 */
	private Integer fg;
	
	/**
	 * 投篮出手数
	 */
	private Integer fga;
	
	/**
	 * 投篮命中率
	 */
	private Double fga_pct;
	
	/**
	 * 三分命中数 
	 */
	private Integer fg3;
	
	/**
	 * 三分出手数
	 */
	private Integer fg3a;
	
	/**
	 * 三分命中率
	 */
	private Double fg3_pct;
	
	/**
	 * 两分命中数
	 */
	private Integer fg2;
	
	/**
	 * 两分投篮数
	 */
	private Integer fg2a;
	
	/**
	 * 两分命中率
	 */
	private Double fg2_pct;
	
	/**
	 * 罚球命中数
	 */
	private Integer ft;
	
	/**
	 * 罚球出手数
	 */
	private Integer fta;
	
	/**
	 * 罚球命中率
	 */
	private Double ft_pct;
	
	/**
	 * 进攻篮板
	 */
	private Integer orb;
	
	/**
	 * 防守篮板
	 */
	private Integer drb;
	
	/**
	 * 总篮板
	 */
	private Integer trb;
	
	/**
	 * 助攻
	 */
	private Integer ast;
	
	/**
	 * 抢断
	 */
	private Integer stl;
	
	/**
	 * 盖帽
	 */
	private Integer blk;
	
	/**
	 * 失误
	 */
	private Integer tov;
	
	/**
	 * 犯规
	 */
	private Integer pf;
	
	/**
	 * 得分
	 */
	private Integer pts;

	/**
	 * 无参构造函数
	 */
	public OpponentStatsTotal(){}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Integer getFg() {
		return fg;
	}

	public void setFg(Integer fg) {
		this.fg = fg;
	}

	public Integer getFga() {
		return fga;
	}

	public void setFga(Integer fga) {
		this.fga = fga;
	}

	public Double getFga_pct() {
		return fga_pct;
	}

	public void setFga_pct(Double fga_pct) {
		this.fga_pct = fga_pct;
	}

	public Integer getFg3() {
		return fg3;
	}

	public void setFg3(Integer fg3) {
		this.fg3 = fg3;
	}

	public Integer getFg3a() {
		return fg3a;
	}

	public void setFg3a(Integer fg3a) {
		this.fg3a = fg3a;
	}

	public Double getFg3_pct() {
		return fg3_pct;
	}

	public void setFg3_pct(Double fg3_pct) {
		this.fg3_pct = fg3_pct;
	}

	public Integer getFg2() {
		return fg2;
	}

	public void setFg2(Integer fg2) {
		this.fg2 = fg2;
	}

	public Integer getFg2a() {
		return fg2a;
	}

	public void setFg2a(Integer fg2a) {
		this.fg2a = fg2a;
	}

	public Double getFg2_pct() {
		return fg2_pct;
	}

	public void setFg2_pct(Double fg2_pct) {
		this.fg2_pct = fg2_pct;
	}

	public Integer getFt() {
		return ft;
	}

	public void setFt(Integer ft) {
		this.ft = ft;
	}

	public Integer getFta() {
		return fta;
	}

	public void setFta(Integer fta) {
		this.fta = fta;
	}

	public Double getFt_pct() {
		return ft_pct;
	}

	public void setFt_pct(Double ft_pct) {
		this.ft_pct = ft_pct;
	}

	public Integer getOrb() {
		return orb;
	}

	public void setOrb(Integer orb) {
		this.orb = orb;
	}

	public Integer getDrb() {
		return drb;
	}

	public void setDrb(Integer drb) {
		this.drb = drb;
	}

	public Integer getTrb() {
		return trb;
	}

	public void setTrb(Integer trb) {
		this.trb = trb;
	}

	public Integer getAst() {
		return ast;
	}

	public void setAst(Integer ast) {
		this.ast = ast;
	}

	public Integer getStl() {
		return stl;
	}

	public void setStl(Integer stl) {
		this.stl = stl;
	}

	public Integer getBlk() {
		return blk;
	}

	public void setBlk(Integer blk) {
		this.blk = blk;
	}

	public Integer getTov() {
		return tov;
	}

	public void setTov(Integer tov) {
		this.tov = tov;
	}

	public Integer getPf() {
		return pf;
	}

	public void setPf(Integer pf) {
		this.pf = pf;
	}

	public Integer getPts() {
		return pts;
	}

	public void setPts(Integer pts) {
		this.pts = pts;
	}

	public Integer getNum_of_game() {
		return num_of_game;
	}

	public void setNum_of_game(Integer num_of_game) {
		this.num_of_game = num_of_game;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}
	
}
