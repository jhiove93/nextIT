package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴 
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재 황정민 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("기생충", "가장 완벽한 계획이 뭔지 알아? 무계획이야.", "송강호 이선균 조여정 최우식", "ㄱㅅㅊ"));
		movieList.add(new Movie("아저씨", "금이빨빼고 모조리 씹어먹어줄게", "원빈 김새론", "ㅇㅈㅆ"));
		movieList.add(new Movie("7번방의 선물", "아빠딸로 태어나서 고맙습니다.", "류승룡 박신혜 오달수", "ㅊㅂㅂㅇ ㅅㅁ"));
		movieList.add(new Movie("친구", "느그 아부지 뭐하시노?", "장동건 유오성", "친구"));
		movieList.add(new Movie("명량", "아직 신에게는 12척의 배가 남아있습니다.", "최민식 류승룡 조진웅", "ㅁ"));
		movieList.add(new Movie("극한직업", "지금까지 이런맛은 없었다 갈비인가 통닭인가 ", "류승룡 이하늬 이동휘 공명", "ㄱㅎㅈㅇ"));
		movieList.add(new Movie("베테랑", "멧돌손잡이를 어이라 그래요 ...지금 내기분이 그래. 어이가 없네?", "황정민 유아인 유해진", "ㅂㅌㄹ"));
		movieList.add(new Movie("타짜", "동작 그만! 밑장빼기냐? 내가 빙다리 핫바지로 보이냐?", "조승우 유해진 김혜수 ", "ㅌㅉ"));
		movieList.add(new Movie("곡성", "뭣이 중헌디!", "곽도원 황정민 쿠니무라 준", "ㄱㅅ"));
	}
	
	private static MovieDB instance = new MovieDB();
	
	public static MovieDB getInstance() {
		return instance;
	}
	public ArrayList<Movie> getMovieList(){
		return movieList;
	}
	
	
	
	
	
}
