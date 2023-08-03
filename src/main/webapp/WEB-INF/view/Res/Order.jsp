<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OrderPage</title>

<%@include file="/resources/static/jsp/cdn.jsp" %>

<style>
	<%@include file="/resources/static/css/Order.css" %>
	<%@include file="/resources/static/css/reset.css" %>
	
</style>
</head>
<body>

<div id="wrap">

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
                <img src="image/icon_instgram.png" alt="아이콘_인스타그램" />
              </a>
            </li>
            <li>
              <a href="javascript:;">
                <img src="image/icon_facebook.png" alt="아이콘_페이스북" />
              </a>
            </li>
            <li>
              <a href="javascript:;">
                <img src="image/icon_blog.png" alt="아이콘_블로그" />
              </a>
            </li>
            <li>
              <a href="javascript:;">
                <img src="image/icon_youtube.png" alt="아이콘_유튜브" />
              </a>
            </li>

            <li>
              <a href="javascript:;">
                <img src="image/icon_twitter.png" alt="아이콘_트위터" />
              </a>
            </li>
          </ul>

          <h1 class="logo">
            <a href="/index.html"
              ><img src="image/rowLogo.png" alt="상단로고"
            /></a>
          </h1>

          <ul class="head_right_icon">
            <li>
              <a href="/로그인html.html"><strong>6조</strong>님</a>
            </li>
            <li class="basket_icon">
              <a href="/주문index.html"
                ><img src="image/basket_icon.png" alt="장바구니_아이콘"
              /></a>
            </li>
            <li class="search_icon">
              <a href="javascript:;"
                ><img src="image/search.png" alt="찾기_아이콘"
              /></a>
            </li>
          </ul>
        </div>
      </header>

      <nav>
        <div class="boxalign">
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
              <a href="/menu.html">MENU</a>
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

      <section>
        <div class="order_ing">
          <button>
            <div>주문/결제</div>
            주문완료
          </button>
        </div>
        <div class="order_list">
          <div class="boxalign">
            <div>20230714</div>
            <div class="order_img2">
              <input type="checkbox" />
              <img src="image/1619856877.png" alt="" />
              <div class="order_txt">
                <span>베리베리스트로베리</span>
                <span>사이즈:파인트</span>
                <span>30,000원</span>
              </div>
              <div class="ect">
                <button>&times;</button>
                <button></button>
              </div>
            </div>
            <div class="order_img">
              <input type="checkbox" />
              <img src="image/1619858183.png" alt="" />
              <div class="order_txt">
                <span>베리베리스트로베리</span>
                <span>사이즈:파인트</span>
                <span>30,000원</span>
              </div>
              <div class="ect">
                <button>&times;</button>
                <button></button>
              </div>
            </div>
            <div class="more"><img src="image/storage.png" alt="">더 담으러 가기</div>
          </div>
        </div>

        <div class="order_button">결제하기</div>
      </section>
      <footer>
        <div class="boxalign">
          <div class="sns">
            <a href="javascript:;"
              ><img src="image/icon_blog.png" alt="페이스북"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_instgram.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_twitter.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_youtube.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_facebook.png" alt="인스타그램"
            /></a>
          </div>

          <div class="footer_logo">
            <a href="javascript:;">
              <img src="image/rowLogo.png" alt="하단로고" />
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
<script src="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.js"></script>
    <script src="resources/static/js/Order.js"></script>

</body>
</html>