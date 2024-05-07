#include "NewForm.h"
#include <Windows.h>

using namespace GUICPPKel37;

int WINAPI WinMain(HINSTANCE, HINSTANCE, LPSTR, int) {
	Application::EnableVisualStyles();
	Application::SetCompatibleTextRenderingDefault(false);
	Application::Run(gcnew NewForm());
	return 0;
}

