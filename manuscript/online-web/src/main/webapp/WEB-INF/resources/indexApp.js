var indexApp = angular.module('indexApp', ['ngRoute', 'ngMessages', 'ui.bootstrap', 'ui.bootstrap.typeahead']);

indexApp.config(['$routeProvider', '$locationProvider',
	function ($routeProvider, $locationProvider) {
		$locationProvider.hashPrefix('');

		$routeProvider.when('/logout', {
			resolve: {
				preload: function ($http) {
					return $http.post('logout').then(function successCallback(response) {
						window.location = 'login.html';
						console.log("success: ", response);
					}, function errorCallback(response) {
						console.log("error: ", response);
					})
				}
			}
		}).when('/personalDataSettings', {
			templateUrl: 'static/management/personalDataSettingsTemplate.html',
			controller: 'personalDataSettingsController'
		}).when('/', {
			templateUrl: 'static/index/indexTemplate.html'
		})
	}]);