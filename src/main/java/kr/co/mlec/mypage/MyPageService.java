package kr.co.mlec.mypage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.vo.MemberVO;


@Service
public class MyPageService implements MyPageServiceInter {

	@Autowired
	private MyPageDAO mypageDAO;
	
	@Override
	public void updateMember(MemberVO userVO) {
		mypageDAO.updateMember(userVO);
		
	}

	public int updateProfileImg(MemberVO userVO) {
		return mypageDAO.updateProfileImg(userVO);
	}

	public int deleteProfileImg(MemberVO userVO) {
		return mypageDAO.deleteProfileImg(userVO);
	}
}
