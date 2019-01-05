package kr.co.mlec.diary;

import java.util.List;

import kr.co.mlec.vo.DiaryVO;


public interface DiaryDAOInter {

	public List<DiaryVO> selectAllDiary();
	public DiaryVO selectDiary(int no);
	public int insertDiary(DiaryVO diary);
}
