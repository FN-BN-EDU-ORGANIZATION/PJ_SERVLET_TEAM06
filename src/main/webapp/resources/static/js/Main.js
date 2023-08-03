//dropdown메뉴
document.addEventListener("DOMContentLoaded", function () {
  var mainNavItems = document.querySelectorAll(".main_nav >li");

  mainNavItems.forEach(function (item) {
    item.addEventListener("mouseenter", function () {
      this.classList.add("active");
    });

    item.addEventListener("mouseleave", function () {
      this.classList.remove("active");
    });
  });
});

//dropdown메뉴 이미지 교차화면
const subNavItems = document.querySelectorAll(".main_nav > li");
const originalBackgroundURL = "image/menu_kakao_img.png";
const hoverBackgroundURLs = [
  "image/1698818148.png",
  "image/1746498851.png",
  "image/1746499595.png",
];
let currentBackgroundIndex = 0;

function handleBackgroundFadeIn(event) {
  const subNavItem = event.currentTarget;
  const subNavImg = subNavItem.querySelector("a.sub_nav_img");
  subNavImg.style.backgroundImage = `url("${hoverBackgroundURLs[currentBackgroundIndex]}")`;
}

function handleBackgroundFadeOut(event) {
  const subNavItem = event.currentTarget;
  const subNavImg = subNavItem.querySelector("a.sub_nav_img");
  subNavImg.style.backgroundImage = `url("${originalBackgroundURL}")`;
}

subNavItems.forEach((subNavItem) => {
  subNavItem.addEventListener("mouseenter", handleBackgroundFadeIn);
  subNavItem.addEventListener("mouseleave", handleBackgroundFadeOut);

  const subNavImg = subNavItem.querySelector("a.sub_nav_img");
  subNavImg.style.backgroundImage = `url("${hoverBackgroundURLs[currentBackgroundIndex]}")`;
});
function toggleBackgroundImage() {
  currentBackgroundIndex =
    (currentBackgroundIndex + 1) % hoverBackgroundURLs.length;
  subNavItems.forEach((subNavItem) => {
    const subNavImg = subNavItem.querySelector("a.sub_nav_img");
    subNavImg.style.backgroundImage = `url("${hoverBackgroundURLs[currentBackgroundIndex]}")`;
  });
}

setInterval(toggleBackgroundImage, 4000);

var swiper = new Swiper(".mySwiper", {
  spaceBetween: 30,
  centeredSlides: true,
  autoplay: {
    delay: 4000,
    disableOnInteraction: false,
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  navigation: {
    nextEl: ".swiper-button-next",
    prevEl: ".swiper-button-prev",
  },
  scrollbar: {
    el: ".swiper-scrollbar",
  },
  mousewheel: false,
});

//scroll이벤트--------------------
const toTopBtn_el = document.getElementById("totop");
toTopBtn_el.addEventListener("click", function () {
  window.scrollTo({ top: 0, behavior: "smooth" });
});

const toMenuBtn_el = document.getElementById("tomenu");
toMenuBtn_el.addEventListener("click", function () {
  window.scrollTo({ top: 700, behavior: "smooth" });
});

const toInfoBtn_el = document.getElementById("toinfo");
toInfoBtn_el.addEventListener("click", function () {
  window.scrollTo({ top: 1550, behavior: "smooth" });
});

const toEventBtn_el = document.getElementById("toevent");
toEventBtn_el.addEventListener("click", function () {
  window.scrollTo({ top: 2300, behavior: "smooth" });
});

//창열고 닫기 이벤트--------------------
const closeItems = document.querySelectorAll(".close");
const searchPages = document.querySelectorAll(".search_page");
const searchItems = document.querySelectorAll(".search_icon");

// 각 검색 아이콘에 클릭 이벤트 리스너 추가
searchItems.forEach((searchItem) => {
  searchItem.addEventListener("click", function () {
    // 각 해당 검색 페이지에 "active" 클래스 추가
    searchPages.forEach((searchPage) => {
      searchPage.classList.add("active");
    });
  });
});

// 각 닫기 버튼에 클릭 이벤트 리스너 추가
closeItems.forEach((closeItem) => {
  closeItem.addEventListener("click", function () {
    // 각 해당 검색 페이지에서 "active" 클래스 제거
    searchPages.forEach((searchPage) => {
      searchPage.classList.remove("active");
    });
  });
});
