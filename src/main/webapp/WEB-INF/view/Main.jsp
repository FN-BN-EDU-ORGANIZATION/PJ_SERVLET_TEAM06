<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MainPage</title>

<%@include file="/resources/static/jsp/cdn.jsp" %>
<% String id = (String) session.getAttribute("id");
System.out.println(id);


%>

<% String name = (String) session.getAttribute("name");
System.out.println(name);


%>

<% String role = (String) session.getAttribute("role");
System.out.println(role);


%>

<style>
	<%@include file="/resources/static/css/Main.css" %>
	<%@include file="/resources/static/css/reset.css" %>
</style>

</head>

<body>
<div id="wrap">
      <div class="scroll_btn">
        <div class="scroll_img">
          <div class="scroll_text">
            <a href="javascript:void(0)" class="bt1" id="tomenu">MENU</a>
            <a href="javascript:void(0)" class="bt2" id="toevent">EVENT</a>
            <a href="javascript:void(0)" class="bt3" id="toinfo">STORE</a>
            <a href="javascript:void(0)" class="bt4" id="totop">BASKIN</a>
          </div>
          <img src="./image/ballown.png" alt="" />
        </div>
      </div>

      <div class="search_page">
        <input placeholder="매장 또는 메뉴정보를 검색할 수 있습니다" />
        <button class="search01">검색하기</button>
        <button class="close">&times;</button>
      </div>

      <header>
        <div class="boxalign">
          <ul class="head_left_icon">
            <li>
              <a href="javascript:;">
                <img src="./image/icon_instgram.png" alt="아이콘_인스타그램" />
              </a>
            </li>
            <li>
              <a href="javascript:;">
                <img src="./image/icon_facebook.png" alt="아이콘_페이스북" />
              </a>
            </li>
            <li>
              <a href="javascript:;">
                <img src="./image/icon_blog.png" alt="아이콘_블로그" />
              </a>
            </li>
            <li>
              <a href="javascript:;">
                <img src="./image/icon_youtube.png" alt="아이콘_유튜브" />
              </a>
            </li>

            <li>
              <a href="javascript:;">
                <img src="./image/icon_twitter.png" alt="아이콘_트위터" />
              </a>
            </li>
          </ul>

          <h1 class="logo">
            <a href="javascipt:;"
              ><img src="./image/rowLogo.png" alt="상단로고"
            /></a>
          </h1>

          <ul class="head_right_icon">
            <li>
            
            <c:if test="${empty role}">
				<a href=<c:url value="/login.do"/>><strong></strong>로그인</a>
			</c:if>
			<c:if test="${not empty role}">
				<a href=<c:url value="/logout.do"/>><strong>${name}</strong>로그아웃</a>
			</c:if>
         <!--  <a href=<c:url value="/login.do"/>><strong>로그인</strong></a> -->
              
            </li>
            <li class="basket_icon">
              <a href="javascript:;"
                ><img src="./image/basket_icon.png" alt="장바구니_아이콘"
              /></a>
            </li>
            <li class="search_icon">
              <a href="javascript:;"
                ><img src="./image/search.png" alt="찾기_아이콘"
              /></a>
            </li>
          </ul>
        </div>
      </header>

      <nav>
        <div class="boxalign" id="FIRST">
          <ul class="main_nav">
            <li>
              <a href="#">BEST MONTH</a>
              <div class="sub_nav">
                <ul>
                  <li>
                    <a class="sub_nav_img" href="#"></a>
                  </li>
                  <li>
                    <a href="#">아이스크림</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">케이크</a></li>
                        <li><a href="#">음료</a></li>
                        <li><a href="#">커피</a></li>
                        <li><a href="#">디저트</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">진행이벤트</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">당첨자발표</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">매장찾기</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">단체주문</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">공지사항</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">보도자료</a></li>
                        <li><a href="#">채용정보</a></li>
                        <li><a href="#">점포개설문의</a></li>
                      </ul>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <a href="#">MENU</a>
              <div class="sub_nav">
                <ul>
                  <li>
                    <a class="sub_nav_img" href="#"></a>
                  </li>
                  <li>
                    <a href="#">아이스크림</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">케이크</a></li>
                        <li><a href="#">음료</a></li>
                        <li><a href="#">커피</a></li>
                        <li><a href="#">디저트</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">진행이벤트</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">당첨자발표</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">매장찾기</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">단체주문</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">공지사항</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">보도자료</a></li>
                        <li><a href="#">채용정보</a></li>
                        <li><a href="#">점포개설문의</a></li>
                      </ul>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <a href="#">EVENT</a>
              <div class="sub_nav">
                <ul>
                  <li>
                    <a class="sub_nav_img" href="#"></a>
                  </li>
                  <li>
                    <a href="#">아이스크림</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">케이크</a></li>
                        <li><a href="#">음료</a></li>
                        <li><a href="#">커피</a></li>
                        <li><a href="#">디저트</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">진행이벤트</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">당첨자발표</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">매장찾기</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">단체주문</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">공지사항</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">보도자료</a></li>
                        <li><a href="#">채용정보</a></li>
                        <li><a href="#">점포개설문의</a></li>
                      </ul>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <a href="#">STORE</a>
              <div class="sub_nav">
                <ul>
                  <li>
                    <a class="sub_nav_img" href="#"></a>
                  </li>
                  <li>
                    <a href="#">아이스크림</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">케이크</a></li>
                        <li><a href="#">음료</a></li>
                        <li><a href="#">커피</a></li>
                        <li><a href="#">디저트</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">진행이벤트</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">당첨자발표</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">매장찾기</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">단체주문</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">공지사항</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">보도자료</a></li>
                        <li><a href="#">채용정보</a></li>
                        <li><a href="#">점포개설문의</a></li>
                      </ul>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <a href="#">ABOUT</a>
              <div class="sub_nav">
                <ul>
                  <li>
                    <a class="sub_nav_img" href="#"></a>
                  </li>
                  <li>
                    <a href="#">아이스크림</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">케이크</a></li>
                        <li><a href="#">음료</a></li>
                        <li><a href="#">커피</a></li>
                        <li><a href="#">디저트</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">진행이벤트</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">당첨자발표</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">매장찾기</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">고객센터</a></li>
                        <li><a href="#">단체주문</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <a href="#">공지사항</a>
                    <div class="sub_nav_sub">
                      <ul>
                        <li><a href="#">보도자료</a></li>
                        <li><a href="#">채용정보</a></li>
                        <li><a href="#">점포개설문의</a></li>
                      </ul>
                    </div>
                  </li>
                </ul>
              </div>
            </li>
          </ul>
        </div>
      </nav>

      <main>
        <div class="swiper mySwiper">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
              <div class="main_text_cream boxalign">
                <h4>
                  쿼터 구매시 <br />
                  <strong> 카카오비치</strong>
                  3종 세트
                </h4>
                <a href="#">사전예약 하러가기</a>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="main_text_cream boxalign">
                <h4>
                  <strong>제주옵서옝:)</strong> <br />
                  제주와 카카오프렌즈가 만났다!
                </h4>
                <a href="#">기념품받기 </a>
              </div>
            </div>
            <div class="swiper-slide">
              <div class="main_text_cream boxalign">
                <h4>
                  라춘이와 떠나는 8월의 행복 <br />
                  <strong>트리퀀시</strong>
                  트립!
                </h4>
                <a href="#">참여하러 가기</a>
              </div>
            </div>
          </div>
          <div class="swiper-pagination"></div>
          <div class="swiper-button-prev"></div>
          <div class="swiper-button-next"></div>

          <div class="swiper-scrollbar"></div>
        </div>
      </main>

      <section class="section_recommand">
        <div class="boxalign">
          <div class="recommand_txt">
            <div class="recommand_title">B<b>R</b><strong>menu</strong></div>
            <a href="javascript:;"
              >전체보기 <i class="fa-solid fa-arrow-right"></i
            ></a>
          </div>

          <div class="recommand_img">
            <div class="reco_left">
              <a href="javascript:;">
                <img src="./image/reco_1.png" alt="추천메뉴1" class="reco01" />
                <img src="./image/arrow.png" alt="화살표" />
                <span>전 세계가 인정한 <br /><b>아이스크림의 기준</b></span>
              </a>
            </div>
            <div class="reco_middle">
              <a href="javascript:;">
                <img src="./image/reco_2.png" alt="추천메뉴2" class="reco02" />
                <img src="./image/arrow.png" alt="화살표" />
                <span>아이스크림으로 즐겨<br /><b>베라의 음료</b></span>
              </a>
            </div>
            <div class="reco_right">
              <a href="javascript:;">
                <img src="./image/reco_3.png" alt="추천메뉴3" class="reco03" />
                <img src="./image/arrow.png" alt="화살표" />
                <span
                  >특별한 날, 베라와 함께 <br /><b>아이스크림 케이크</b></span
                >
              </a>
            </div>
          </div>
        </div>
      </section>

      <section class="map" id="THIRD">
        <div class="boxalign">
          <div class="map_title">B<b>R</b><strong>store</strong></div>
          <div class="map_subtitle">
            내 주변에서 가장 가까운 <strong>매장</strong>을 찾아보세요!
          </div>

          <a class="map_img">
            <div><img src="./image/icecream_map.png" alt="" /></div>
            <div><img src="./image/icecream_map.png" alt="" /></div>
            <div><img src="./image/icecream_map.png" alt="" /></div>
            <div class="store_search">매장찾기</div>
            <div><img src="./image/map.png" alt="" /></div>
          </a>
        </div>
      </section>
      
      <section class="section_event" id="SECOND">
        <div class="event_title">B<b>R</b><strong>event</strong></div>
        <div class="boxalign">
          <div class="event_txt">
            <div>춘식이랑 <span>해외여행</span></div>
            <div>#돌리면 #해외여행 #아이패드</div>
            <button>참여하기</button>
          </div>
          <div class="event_img">
            <img src="./image/eventroulette_particle.png" alt="파티클" />
            <img src="./image/eventroulette_body.png" alt="룰렛바디" />
          </div>
        </div>
      </section>

      <footer>
        <div class="boxalign">
          <div class="sns">
            <a href="javascript:;"
              ><img src="./image/icon_blog.png" alt="페이스북"
            /></a>
            <a href="javascript:;"
              ><img src="./image/icon_instgram.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="./image/icon_twitter.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="./image/icon_youtube.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="./image/icon_facebook.png" alt="인스타그램"
            /></a>
          </div>

          <div class="footer_logo">
            <a href="javascript:;">
              <img src="./image/rowLogo.png" alt="하단로고" />
            </a>
            <div>1661 - 5270</div>
          </div>

          <div class="footer_nav">
            <ul>
              <li><a href="javascript:;">이용약관</a></li>
              <li><a href="javascript:;">개인정보처리방침</a></li>
              <li><a href="javascript:;">위치기반서비스</a></li>
              <li><a href="javascript:;">고객센터</a></li>
              <li><a href="javascript:;">인재채용</a></li>
              <li><a href="javascript:;">단체주문</a></li>
            </ul>
          </div>

          <div class="copyright">
            <div>
              주식회사 베스킨라빈스는 통신판매중개자이며 통신판매의 당사자가
              아닙니다. 따라서 상품/ 거래정보 및 거래와 관련하여 베스킨라빈스에
              등록된 판매자의 고의 또는 과실로 소비자에게 발생하는 손해에 대해
              베스킨라빈스는 책임을 지지 않습니다. 상품 및 거래에 관하여 보다
              정확한 정보는 해당 판매자에게 직접 확인하여 주시기 바랍니다.
              <p>Copyright BaskinRobins. All Rights Reserved.</p>
            </div>
          </div>
        </div>
      </footer>
    </div>

  <!-- 스크립트 태그를 맨 아래로 이동 -->
  <<script
      src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/4.17.21/lodash.min.js"
      integrity="sha512-WFN04846sdKMIP5LKNphMaWzU7YpMyCU245etK3g/2ARYbPK9Ub18eG+ljU96qKRCWh+quCY7yefSmlkQw1ANQ=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    ></script>
    <script src="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.js"></script>
  <script src="resources/static/js/Main.js"></script>
</body>
</html>