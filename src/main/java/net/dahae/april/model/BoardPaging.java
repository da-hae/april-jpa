package net.dahae.april.model;


/**
 * 
 * @author yongdae
 */
public class BoardPaging extends BaseEntity{
	
	private static final long serialVersionUID = 3887508115636688661L;
	
	private int pageSize; // 게시 글 수
	private int firstPage; // 첫 번째 페이지 번호
	private int prevPage; // 이전 페이지 번호
	private int startPage; // 시작 페이지 (페이징 네비 기준)
	private int page; // 페이지 번호
	private int endPage; // 끝 페이지 (페이징 네비 기준)
	private int nextPage; // 다음 페이지 번호
	private int finalPage; // 마지막 페이지 번호
	private int totalCount; // 게시 글 전체 수
	
	public BoardPaging(){}
	
	public BoardPaging(int page, int totalCount){
		this.page = page;
		this.totalCount = totalCount;
		this.setPageSize(10);
		this.makePaging();
	}
	
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the firstPage
	 */
	public int getFirstPage() {
		return firstPage;
	}

	/**
	 * @param firstPage the firstPage to set
	 */
	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	/**
	 * @return the prevPage
	 */
	public int getPrevPage() {
		return prevPage;
	}

	/**
	 * @param prevPage the prevPage to set
	 */
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	/**
	 * @return the startPage
	 */
	public int getStartPage() {
		return startPage;
	}

	/**
	 * @param startPage the startPage to set
	 */
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * @return the endPage
	 */
	public int getEndPage() {
		return endPage;
	}

	/**
	 * @param endPage the endPage to set
	 */
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	/**
	 * @return the nextPage
	 */
	public int getNextPage() {
		return nextPage;
	}

	/**
	 * @param nextPage the nextPage to set
	 */
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	/**
	 * @return the finalPage
	 */
	public int getFinalPage() {
		return finalPage;
	}

	/**
	 * @param finalPage the finalPage to set
	 */
	public void setFinalPage(int finalPage) {
		this.finalPage = finalPage;
	}

	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 페이징 생성
	 */
	private void makePaging() {
		if (this.totalCount == 0) return; // 게시 글 전체 수가 없는 경우
		if (this.page == 0) this.setPage(1); // 기본 값 설정
		if (this.pageSize == 0) this.setPageSize(10); // 기본 값 설정

		int finalPage = (totalCount + (pageSize - 1)) / pageSize; // 마지막 페이지
		if (this.page > finalPage) this.setPage(finalPage); // 기본 값 설정

		if (this.page < 0 || this.page > finalPage) this.page = 1; // 현재 페이지 유효성 체크

		boolean isNowFirst = page == 1 ? true : false; // 시작 페이지 (전체)
		boolean isNowFinal = page == finalPage ? true : false; // 마지막 페이지 (전체)

		int startPage = ((page - 1) / 10) * 10 + 1; // 시작 페이지 (페이징 네비 기준)
		int endPage = startPage + 10 - 1; // 끝 페이지 (페이징 네비 기준)

		if (endPage > finalPage) { // [마지막 페이지 (페이징 네비 기준) > 마지막 페이지] 보다 큰 경우
			endPage = finalPage;
		}

		this.setFirstPage(1); // 첫 번째 페이지 번호

		if (isNowFirst) {
			this.setPrevPage(1); // 이전 페이지 번호
		} else {
			this.setPrevPage(((page - 1) < 1 ? 1 : (page - 1))); // 이전 페이지 번호
		}

		this.setStartPage(startPage); // 시작 페이지 (페이징 네비 기준)
		this.setEndPage(endPage); // 끝 페이지 (페이징 네비 기준)

		if (isNowFinal) {
			this.setNextPage(finalPage); // 다음 페이지 번호
		} else {
			this.setNextPage(((page + 1) > finalPage ? finalPage : (page + 1))); // 다음 페이지 번호
		}

		this.setFinalPage(finalPage); // 마지막 페이지 번호
	}
}
