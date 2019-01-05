package kr.co.mlec.diary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.vo.DiaryVO;


@Service
public class DiaryService implements DiaryServiceInter{

	@Autowired
	private DiaryDAO diaryDAO;

	public DiaryVO selectDiary(int no) {
		DiaryVO diary = diaryDAO.selectDiary(no);
		return diary;
	}
	
	public List<DiaryVO> selectAllDiary() {
		List<DiaryVO> diaryList = diaryDAO.selectAllDiary();
		return diaryList;
	}
	
	public int insertDiary(DiaryVO diary) {
		return diaryDAO.insertDiary(diary);
	}
}
