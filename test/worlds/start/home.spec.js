require('../../../src/yose/worlds/start/home.js');

describe('Jasmine', function () {

    it('can assert', function () {
        expect(areYouReady()).toEqual('Yep!');
    });
})