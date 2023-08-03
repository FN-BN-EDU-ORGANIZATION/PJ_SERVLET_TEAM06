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

// Swiper
const swiper = new Swiper('.swiper-container', {
    loop: true,
    centeredSlides: true,
    slidesPerView: 'auto',
    slideToClickedSlide: true,
    effect: 'coverflow',
    coverflowEffect: {
        rotate: 30,
        slideShadows: false,
    },
    autoplay: {
        delay: 3000,
    },
});

// Pagination
// 사진 배열


let photos = [
	
    { category: '아이스크림', name: 'Photo 1', filename: 'image/corn1.png' },
    { category: '아이스크림', name: 'Photo 2', filename: 'image/corn2.png' },
    { category: '아이스크림', name: 'Photo 3', filename: 'image/corn3.png' },
    { category: '아이스크림', name: 'Photo 4', filename: 'image/corn4.png' },
    { category: '아이스크림', name: 'Photo 5', filename: 'image/corn5.png' },
    { category: '아이스크림', name: 'Photo 6', filename: 'image/corn6.png' },
    { category: '아이스크림', name: 'Photo 7', filename: 'image/corn7.png' },
    { category: '아이스크림', name: 'Photo 8', filename: 'image/corn8.png' },
    { category: '아이스크림', name: 'Photo 9', filename: 'image/corn9.png' },
    { category: '아이스크림', name: 'Photo 10', filename: 'image/corn10.png' },
    { category: '아이스크림', name: 'Photo 11', filename: 'image/corn11.png' },
    { category: '아이스크림', name: 'Photo 12', filename: 'image/corn12.png' },
    { category: '아이스크림', name: 'Photo 13', filename: 'image/corn13.png' },
    { category: '아이스크림', name: 'Photo 14', filename: 'image/corn14.png' },
    { category: '아이스크림', name: 'Photo 15', filename: 'image/corn15.png' },
    { category: '아이스크림', name: 'Photo 16', filename: 'image/corn16.png' },
    { category: '아이스크림', name: 'Photo 17', filename: 'image/corn17.png' },
    { category: '아이스크림', name: 'Photo 18', filename: 'image/corn18.png' },
    { category: '아이스크림', name: 'Photo 19', filename: 'image/corn19.png' },
    { category: '아이스크림', name: 'Photo 20', filename: 'image/corn20.png' },
    { category: '아이스크림', name: 'Photo 21', filename: 'image/corn21.png' },
    { category: '아이스크림', name: 'Photo 22', filename: 'image/corn22.png' },
    { category: '아이스크림', name: 'Photo 23', filename: 'image/corn23.png' },
    { category: '아이스크림', name: 'Photo 24', filename: 'image/corn24.png' },
    { category: '아이스크림', name: 'Photo 25', filename: 'image/corn25.png' },
    { category: '아이스크림', name: 'Photo 26', filename: 'image/corn26.png' },
    { category: '아이스크림', name: 'Photo 27', filename: 'image/corn27.png' },
    { category: '아이스크림', name: 'Photo 28', filename: 'image/corn28.png' },
    { category: '아이스크림', name: 'Photo 29', filename: 'image/corn29.png' },
    { category: '아이스크림', name: 'Photo 30', filename: 'image/corn30.png' },
    { category: '아이스크림', name: 'Photo 31', filename: 'image/corn31.png' },
    { category: '아이스크림', name: 'Photo 32', filename: 'image/corn32.png' },
    { category: '커피', name: 'Photo 33', filename: 'image/coffee1.png' },
    { category: '커피', name: 'Photo 34', filename: 'image/coffee2.png' },
    { category: '커피', name: 'Photo 35', filename: 'image/coffee3.png' },
    { category: '케이크', name: 'Photo 36', filename: 'image/cake2.png' },
    { category: '케이크', name: 'Photo 37', filename: 'image/cake3.png' },
    { category: '기타', name: 'Photo 38', filename: 'image/bat.png' },
    { category: '기타', name: 'Photo 39', filename: 'image/creamset1.png' },
    { category: '기타', name: 'Photo 40', filename: 'image/creamset2.png' },
    { category: '기타', name: 'Photo 41', filename: 'image/creamset3.png' },
    { category: '기타', name: 'Photo 42', filename: 'image/cake1.png' }
];


// 페이지네이션 생성 함수
function createPagination() {
    const paginationElement = document.getElementById('pagination');
    const categories = [...new Set(photos.map(photo => photo.category))];

    // 페이지 버튼 생성
    categories.forEach((category, index) => {
        const button = document.createElement('button');
        button.innerText = category;
        button.addEventListener('click', function () {
            displayPhotos(category, 1); // 첫 번째 페이지를 표시하기 위해 1을 전달
        });
        paginationElement.appendChild(button);

        // 페이지 번호 버튼 생성
        for (let i = 1; i <= 4; i++) {
            const pageButton = document.createElement('button');
            pageButton.innerText = i;
            pageButton.addEventListener('click', function () {
                displayPhotos(category, i); // 해당 페이지를 표시
            });
            paginationElement.appendChild(pageButton);
        }
    });
}

// 페이지네이션 생성 함수
function createPagination() {
    const paginationElement = document.getElementById('pagination');
    const categories = [...new Set(photos.map(photo => photo.category))];

    categories.forEach((category, index) => {
        const button = document.createElement('button');
        button.innerText = category;
        button.addEventListener('click', function () {
            displayPhotos(category, 1);
        });
        paginationElement.appendChild(button);
    });
}

// 사진 보여주기 함수
function displayPhotos(category, page) {
    const galleryElement = document.getElementById('gallery');
    galleryElement.innerHTML = '';

    // 현재 카테고리에 해당하는 사진 필터링
    const photosToDisplay = photos.filter(photo => photo.category === category);

    // 페이지당 사진 개수와 전체 페이지 수 계산
    const photosPerPage = 9;
    const totalPages = Math.ceil(photosToDisplay.length / photosPerPage);

    // 시작 인덱스 및 종료 인덱스 계산
    const startIndex = (page - 1) * photosPerPage;
    const endIndex = Math.min(startIndex + photosPerPage, photosToDisplay.length);

    // 현재 페이지에 표시할 사진만 선택
    const photosOnPage = photosToDisplay.slice(startIndex, endIndex);

    // 사진 표시
    photosOnPage.forEach(function (photo) {
        const imageElement = document.createElement('img');
        imageElement.src = photo.filename;
        imageElement.style.width = '150px';
        imageElement.style.height = '150px';
        galleryElement.appendChild(imageElement);
    });

    // 이전 사진 보기 버튼 생성
    // if (page > 1) {
    //     const prevButton = document.createElement('button');
    //     prevButton.innerText = '이전 메뉴 보기';
    //     prevButton.classList.add('prev-button');
    //     prevButton.addEventListener('click', function () {
    //         displayPhotos(category, page - 1);
    //     });
    //     galleryElement.appendChild(prevButton);
    // }
    if (page > 1) {
        const prevButton = document.createElement('button');
        prevButton.classList.add('prev-button');
        
        // 버튼 대신 이미지 엘리먼트 생성
        const prevImage = document.createElement('img');
        prevImage.setAttribute('src','http://localhost:8899/Team06_Servlet2/image/prev-button.jpg')
        //prevImage.src = 'image/prev-button.jpg'; // 
        
        // 이미지 크기 조정
        prevImage.style.width = '60px'; 
        prevImage.style.height = '60px';
        
        // 이미지를 클릭하면 displayPhotos 함수 호출
        prevImage.addEventListener('click', function () {
            displayPhotos(category, page - 1);
        });
        
        // 이미지 엘리먼트를 추가
        prevButton.appendChild(prevImage);
        galleryElement.prepend(prevButton);
    }
    

    // 다음 사진 보기 버튼 생성
    // if (page < totalPages) {
    //     const nextButton = document.createElement('button');
    //     nextButton.innerText = '다음 메뉴 보기';
    //     nextButton.classList.add('next-button');
    //     nextButton.addEventListener('click', function () {
    //         displayPhotos(category, page + 1);
    //     });
    //     galleryElement.appendChild(nextButton);
    // }
    if (page < totalPages) {
        const nextButton = document.createElement('button');
        nextButton.classList.add('next-button');

        // 버튼 대신 이미지 엘리먼트 생성
        const nextImage = document.createElement('img');
        nextImage.src = 'http://localhost:8899/Team06_Servlet2/image/next_n1.jpg' // 그림의 경로를 설정
        // 이미지 크기 조정
        nextImage.style.width = '60px';
        nextImage.style.height = '60px';
        // 이미지를 클릭하면 displayPhotos 함수 호출
        nextImage.addEventListener('click', function () {
            displayPhotos(category, page + 1);
        });

        // 이미지 엘리먼트를 추가
        nextButton.appendChild(nextImage);
        galleryElement.appendChild(nextButton);
    }

}

// 페이지네이션 생성
createPagination();

// 초기 페이지 사진 표시
displayPhotos('아이스크림', 1);
