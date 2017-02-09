var app = angular.module('app', ['ngRoute', 'ngMaterial', 'ngMessages']);

app.config(['$routeProvider', '$locationProvider',
	function ($routeProvider, $locationProvider) {
		$locationProvider.hashPrefix('');

		$routeProvider.when('/registration', {
			templateUrl: 'static/registration/registrationTemplate.html',
			controller: 'registrationController'
		}).when('/', {
			templateUrl: 'static/login/loginTemplate.html',
			controller: 'loginController'
		}).otherwise({
			redirectTo: '/',
			controller: 'loginController'
		});
	}]);