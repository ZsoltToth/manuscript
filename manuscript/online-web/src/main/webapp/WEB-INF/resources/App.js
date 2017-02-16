var app = angular.module('app', ['ngRoute', 'ngMessages', 'ui.bootstrap', 'ui.bootstrap.typeahead']);

app.config(['$routeProvider', '$locationProvider',
	function ($routeProvider, $locationProvider) {
		$locationProvider.hashPrefix('');

		$routeProvider.when('/registration', {
			templateUrl: 'static/registration/registrationTemplate.html',
			controller: 'registrationController',
			resolve: {
				preload: function ($http) {
					return $http.post('registration/preload').then(function (response) {
						console.log(response);
						return response;
					})
				}
			}
		}).when('/', {
			templateUrl: 'static/login/loginTemplate.html',
			controller: 'loginController'
		}).otherwise({
			redirectTo: '/',
			controller: 'loginController'
		});
	}]);