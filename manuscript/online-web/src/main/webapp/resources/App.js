var App = angular.module('App', [ 'ngRoute','ngAnimate', 'ui.bootstrap' ]);

App.config([ '$routeProvider', '$locationProvider',
		function($routeProvider, $locationProvider) {
			$locationProvider.hashPrefix('');
			$routeProvider.when('/registration', {
				templateUrl : 'static/registration.html',
				controller: 'registrationController',
				resolve : {
					preload : function($http) {
						return $http.post('registration/preload').then(function(response) {
							console.log(response);
							return response;
						})
					}
				}
			}).when('/', {
				templateUrl : 'static/login.html'
			}).when('/login', {
				templateUrl : 'static/login.html',
				controller: 'loginController'
			}).otherwise({
				redirectTo : '/'
			});

		} ]);