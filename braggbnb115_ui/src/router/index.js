import Vue from "vue";
import VueRouter from "vue-router";
import DefaultLayout from "@/layouts/DefaultLayout.vue";
import Users from  '@/pages/Users.vue';
import UserDetail from  '@/pages/UserDetail.vue';
import Propertys from  '@/pages/Propertys.vue';
import PropertyDetail from  '@/pages/PropertyDetail.vue';
import Reservations from  '@/pages/Reservations.vue';
import ReservationDetail from  '@/pages/ReservationDetail.vue';
import Reviews from  '@/pages/Reviews.vue';
import ReviewDetail from  '@/pages/ReviewDetail.vue';
import Payments from  '@/pages/Payments.vue';
import PaymentDetail from  '@/pages/PaymentDetail.vue';
import Amenitys from  '@/pages/Amenitys.vue';
import AmenityDetail from  '@/pages/AmenityDetail.vue';
import Images from  '@/pages/Images.vue';
import ImageDetail from  '@/pages/ImageDetail.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: () => import("../views/HomeView.vue"),
			redirect: '/users',
							  },
  {
    path: "/pricing",
    name: "PricingView",
    component: () => import("../views/PricingView.vue"),
  },
  {
    path: "/arts-gallery",
    name: "ArtsGalleryView",
    component: () => import("../views/ArtsGalleryView.vue"),
  },
  {
    path: "/checkout/:id",
    name: "CheckoutView",
    component: () => import("../views/CheckoutView.vue"),
  },
  {
    path: "/stripe-checkout",
    name: "StripeCheckoutView",
    component: () => import("../views/StripeCheckoutView.vue"),
  },
	{
		path: '/users',
		name: 'Users',
		layout: DefaultLayout,
		component: Users,
	},
	{
	    path: '/user/:userId', 
	    name: 'UserDetail',
		layout: DefaultLayout,
	    component: UserDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/propertys',
		name: 'Propertys',
		layout: DefaultLayout,
		component: Propertys,
	},
	{
	    path: '/property/:propertyId', 
	    name: 'PropertyDetail',
		layout: DefaultLayout,
	    component: PropertyDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/reservations',
		name: 'Reservations',
		layout: DefaultLayout,
		component: Reservations,
	},
	{
	    path: '/reservation/:reservationId', 
	    name: 'ReservationDetail',
		layout: DefaultLayout,
	    component: ReservationDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/reviews',
		name: 'Reviews',
		layout: DefaultLayout,
		component: Reviews,
	},
	{
	    path: '/review/:reviewId', 
	    name: 'ReviewDetail',
		layout: DefaultLayout,
	    component: ReviewDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/payments',
		name: 'Payments',
		layout: DefaultLayout,
		component: Payments,
	},
	{
	    path: '/payment/:paymentId', 
	    name: 'PaymentDetail',
		layout: DefaultLayout,
	    component: PaymentDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/amenitys',
		name: 'Amenitys',
		layout: DefaultLayout,
		component: Amenitys,
	},
	{
	    path: '/amenity/:amenityId', 
	    name: 'AmenityDetail',
		layout: DefaultLayout,
	    component: AmenityDetail,
	    props: true // Pass route params as props to the component
  	},
	{
		path: '/images',
		name: 'Images',
		layout: DefaultLayout,
		component: Images,
	},
	{
	    path: '/image/:imageId', 
	    name: 'ImageDetail',
		layout: DefaultLayout,
	    component: ImageDetail,
	    props: true // Pass route params as props to the component
  	},
];

const router = new VueRouter({
  mode: "hash",
  base: process.env.BASE_URL,
  routes,
});

export default router;
